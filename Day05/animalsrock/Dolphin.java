
package animalsrock;

public class Dolphin extends Mammal {
    
    public static final String SPECIES = "Tursiops truncatus";

    public Dolphin(int age, boolean isFemale) {
        super(age, isFemale);
    }

    @Override
    public void play() {
        this.swim();
        System.out.println("The dolphin goes: Squeak sqeak splash.");
    }
    
    public void swim() {
        System.out.println("The dolphin swims around.");
    }
}
