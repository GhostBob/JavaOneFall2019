package betterhumans;

public class BetterHumans {

    public static void main(String[] args) {
        Human bob = new Human();
        System.out.println(bob.getName());
        System.out.println(bob.getGender());

        Human susan = new Human("Susan", 21, "Blonde", "Blue", "Swedish",
                "Female", "Female");
        System.out.println(susan.getName());
        System.out.println(susan.getNationality());

        Human tim = new Human("Tim");
        System.out.println(tim.getNationality());
        
        Dog dog = new Dog();
        Dog dog2 = new Dog("Rex");
        dog2.setBreed("Poodle");
        Dog dog3 = new Dog("Violet", "Lab", 80, "Black");
        
        dog.printDetails(); //I made a printDetails method to save time.
        dog2.printDetails();
        dog3.printDetails();
        
        System.out.println(dog); //Even easier way to do it! With toString!!
        System.out.println(dog2);
        System.out.println(dog3);
        
        System.out.println(Dog.SCIENTIFIC_NAME);
        System.out.println("Number of dogs: " + Dog.getNumberOfDogs());
        
        Dog dog4 = new Dog();
        System.out.println("Number of dogs: " + Dog.getNumberOfDogs());
    }

}
