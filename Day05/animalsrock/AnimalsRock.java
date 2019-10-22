package animalsrock;

import java.util.ArrayList;

public class AnimalsRock {

    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin(5, true);
        Dog dog = new Dog(7, false);
        Duck duck = new Duck(2, true);
        Chicken chicken = new Chicken(4, false);
        Chicken chicken2 = new Chicken(2, true);
        
        dolphin.swim();
        duck.swim();
        
        ArrayList<Mammal> mammals = new ArrayList();
        mammals.add(dog);
        mammals.add(dolphin);
        
        for (Mammal m : mammals) {
            m.play();
        }
        
        ArrayList<Egg> eggs = new ArrayList();
        ArrayList<Bird> birds = new ArrayList();
        birds.add(duck);
        birds.add(chicken);
        birds.add(chicken2);
        for (Bird b : birds) {
            b.fly();
            Egg egg = b.layAnEgg();
            if (egg != null)
                eggs.add(egg);
        }
        
        System.out.println("After laying, I have " + eggs.size() + " eggs!");
        
        System.out.println("Chicken species: " + Chicken.SPECIES);
        System.out.println("Dog species: " + Dog.SPECIES);
        System.out.println("Dolphin species: " + Dolphin.SPECIES);
        System.out.println("Duck species: " + Duck.SPECIES);
    }
}
