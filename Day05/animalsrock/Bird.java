
package animalsrock;

public abstract class Bird extends Animal {

    public Bird(int age, boolean isFemale) {
        super(age, isFemale);
    }

    public abstract void fly();
    
    public Egg layAnEgg() {
        if (this.isFemale)
            return new Egg();
        else
            return null;
    }
}
