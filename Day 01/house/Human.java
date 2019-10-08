package house;

import java.util.Scanner;

public class Human {
    //Static (universal to all Human) variables.
    public static int numberOfHumansOnThePlanet;
    public static Scanner scanner = new Scanner(System.in);
    
    //Instance (per-human) variables.
    public String name;
    public String socialSecurityNumber;
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }
    
    public String getSocialSecurityNumber() {
        return "Haha, nice try, asshole.";
    }
    
    public void introduceYourself() {
        System.out.println("Hello, my name is " + this.name);
    }
}
