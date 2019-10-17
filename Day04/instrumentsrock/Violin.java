package instrumentsrock;

public class Violin extends Instrument {
    
    public int stringWearPercentage;
    
    public Violin() {
        this.value = 100;
        this.keyRange = "A to Q";
        this.stringWearPercentage = 50;
    }

    @Override
    public void play() {
        System.out.println("Squeak squeaker squeak squeakity!");
        this.stringWearPercentage++;
    }
    
    public void changeStrings() {
        this.stringWearPercentage = 0;
    }

}
