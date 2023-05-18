public class Gara {
    private static final int kartMax = 4;
    private int kartSulTracciato;
    public Gara() {}

    public synchronized void entraInPista(Pilota t)
    {
        while(kartSulTracciato == kartMax)
        {
            try {
                System.out.println(Thread.currentThread().getName() + " attende che si liberi un posto in pista");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        kartSulTracciato++;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(Thread.currentThread().getName() + " è entrato in pista, inizia a fare i giri: ");
        for(int i = 0; i < t.getNumGiri(); i++)
        {
            System.out.println(Thread.currentThread().getName() + " sta facendo il giro: " + (i+1));
        }
        System.out.println("-----------------------------------------------------------------------");
       
    }

    public synchronized void esceDallaPista()
    {
        kartSulTracciato--;
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(Thread.currentThread().getName() + " ha finito la gara, è uscito dalla pista");
        notifyAll();
    }
    
}
