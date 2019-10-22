
package animalsrock;

public class Duck extends Bird {
    
    public static final String SPECIES = "Anas platyrhynchos";

    public Duck(int age, boolean isFemale) {
        super(age, isFemale);
    }

    @Override
    public void fly() {
        System.out.println("Flap flap. This duck will go south for the winter.");
    }
    
    public void swim() {
        System.out.println("The duck swims around and quacks merrily.");
    }
}
