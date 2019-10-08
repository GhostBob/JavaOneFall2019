package house;

import java.util.Scanner;

public class House {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat();
        cat.meow();
        Cat.staticMeow();
        
        Human human = new Human();
        Human human2 = new Human();
        human.name = "Steve";
        human2.name = "Susan";
        
        human.introduceYourself();
        human2.introduceYourself();
        
        String humanName = human.getName();
        System.out.println(humanName);
        human.setName("Alex");
        human.setSocialSecurityNumber("12345");
        System.out.println(human.getName());
        System.out.println(human.getSocialSecurityNumber());
    }
}
