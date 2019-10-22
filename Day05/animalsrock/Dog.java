
package animalsrock;

public class Dog extends Mammal {
    
    public static final String SPECIES = "Canis lupus familiaris";

    public Dog(int age, boolean isFemale) {
        super(age, isFemale);
    }

    @Override
    public void play() {
        System.out.println("The dog runs around barking.");
    }

}
