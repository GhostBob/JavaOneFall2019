/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package betterhumans;

public class Dog {
    
    public static final String SCIENTIFIC_NAME = "Canis Lupus Familiaris";
    private static int numberOfDogs = 0;
    
    private String name;
    private String breed;
    private int weight;
    private String color;

    public Dog() {
        numberOfDogs++;
        this.name = "Rover";
        this.breed = "Mutt";
        this.weight = 20;
        this.color = "Brown";
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public Dog(String name, String breed, int weight, String color) {
        this();
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getColor() + " " + 
                this.getBreed();
    }
    
    public void printDetails() {
        System.out.println(this.getName() + ": " + this.getColor() + " " + 
                this.getBreed());
    }
    
    // ** Standard getters and setters ** 

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
