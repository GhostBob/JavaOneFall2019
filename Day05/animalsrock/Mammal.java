
package animalsrock;

public abstract class Mammal extends Animal {
    
    public Mammal(int age, boolean isFemale) {
        super(age, isFemale);
    }

    public abstract void play();
}
