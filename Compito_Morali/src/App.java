import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Gara g = new Gara();
        ArrayList<Pilota> piloti = new ArrayList<>();
        for(int i = 0; i < 8; i++)
        {

            piloti.add(new Pilota("Pilota " + (i+1) + "", g, creaNumGiriRandom()));
        }
        for(Pilota p : piloti)
        {
            p.start();
        }
    }
        public static int creaNumGiriRandom()
        {
            return (int) (Math.random() *5 + 1);
        }
    }

