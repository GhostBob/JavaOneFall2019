package instrumentsrock;

public abstract class Instrument {
    
    public String keyRange;
    public double value;
    
    public abstract void play();
    
    public void age() {
        value += 100;
    }
}
