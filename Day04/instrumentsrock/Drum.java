package instrumentsrock;

public class Drum extends Instrument {
    
    public int tensionPercent;
    
    public Drum() {
        this.value = 50;
        this.keyRange = "B";
        this.tensionPercent = 100;
    }

    @Override
    public void play() {
        System.out.println("Bada boom!");
        this.tensionPercent--;
    }

    public void tighten() {
        this.tensionPercent+=10;
        if (this.tensionPercent > 100)
            this.tensionPercent = 100;
    }

    @Override
    public void age() {
        this.value += 50;
    }
}
