
package animalsrock;

public class Chicken extends Bird {
    
    public static final String SPECIES = "Gallus gallus domesticus";

    public Chicken(int age, boolean isFemale) {
        super(age, isFemale);
    }

    @Override
    public void fly() {
        System.out.println("Chickens don't fly so good.");
    }
}
