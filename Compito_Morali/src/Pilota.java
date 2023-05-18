public class Pilota extends Thread{
    private Gara g;
    private int numGiri;

    public Pilota(String name, Gara g, int numGiri) {
        super(name);
        this.g = g;
        this.numGiri = numGiri;
        if(numGiri > 5)   this.numGiri = 5;
    }


    @Override
    public void run()
    {
            try {
                System.out.println(this.currentThread().getName() + " vuole fare: " + numGiri + " giri");
                g.entraInPista(this);
                Thread.sleep( (long) (Math.random()*5000 + 7000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            g.esceDallaPista();
        }
    public int getNumGiri()
    {
        return numGiri;
    }
}
    
