package instrumentsrock;

public class Horn extends Instrument {
    
    public int amountOfSaliva;
    
    public Horn() {
        this.value = 75;
        this.keyRange = "A to Z";
        this.amountOfSaliva = 0;
    }

    @Override
    public void play() {
        System.out.println("Toot toot!");
        this.amountOfSaliva++;
    }
    
    public void drain() {
        this.amountOfSaliva = 0;
    }
}
