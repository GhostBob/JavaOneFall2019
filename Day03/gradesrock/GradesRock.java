
package gradesrock;

import java.util.Random;

public class GradesRock {

    public static void main(String[] args) {
        
        Student bob = new Student(1, "Bob", "Freshman");
        Student carol = new Student(2, "Carol", "Sophomore");
        
        System.out.println(bob);
        System.out.println(carol);
        
        addRandomGrades(bob);
        addRandomGrades(carol);
        
        System.out.println("Bob has " + bob.getGradeCount() + " grades.");
        System.out.println("Carol has " + carol.getGradeCount() + " grades.");
        bob.printGrades();
        carol.printGrades();
        
        double dropped = bob.dropLowest();
        System.out.println("I dropped Bob's " + dropped);
        dropped = carol.dropLowest();
        System.out.println("I dropped Carol's " + dropped);
        
        System.out.println("New Grades:");
        bob.printGrades();
        carol.printGrades();
        
        System.out.println("Bob's Average: " + bob.getCurrentAverage());
        System.out.println("Carol's Average: " + carol.getCurrentAverage());
    }
    
    public static void addRandomGrades(Student s) {
        Random random = new Random();
        for (int i=0; i<10; ++i) {
            int grade = random.nextInt(101);
            s.addGrade(grade);
        }
    }
    
}
