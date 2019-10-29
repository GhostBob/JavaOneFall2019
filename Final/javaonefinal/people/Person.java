package javaonefinal.people;

public class Person {
    protected String name;
    protected int age;
    
    public Person() {
        this.name = "Bob";
        this.age = 21;
    }
    
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + ", age " + this.age;
    }
    
    // ** STANDARD GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
