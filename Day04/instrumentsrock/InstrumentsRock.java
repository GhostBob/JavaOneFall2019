package instrumentsrock;

import java.util.ArrayList;
import java.util.Random;

public class InstrumentsRock {

    public static void main(String[] args) {
        ArrayList<Instrument> instruments = new ArrayList();
        Random random = new Random();
        
        for (int i=0; i<6; ++i) {
            int num = random.nextInt(3);
            if (num == 0)
                instruments.add(new Drum());
            else if (num == 1)
                instruments.add(new Violin());
            else
                instruments.add(new Horn());
        }
        
        for (Instrument i : instruments) {
            i.play();
            
            if (i instanceof Violin) {
                Violin v = (Violin)i;
                v.changeStrings();
            }
        }
        
        //Much time passes.
        for (Instrument i : instruments) {
            i.age();
        }
        
        for (Instrument i : instruments) {
            String[] split = i.getClass().toString().split("\\.");
            System.out.println(split[1] + " value: " + i.value);
        }
    }
}
