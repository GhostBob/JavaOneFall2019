
package arrayssuck;

import java.util.ArrayList;

public class ArraysSuck {

    public static void main(String[] args) {
        int[] grades = new int[6];
        grades[0] = 100;
        grades[1] = 90;
        grades[2] = 80;
        System.out.println(grades.length);
        grades[3] = 70;
        grades[4] = 60;
        grades[5] = 50;
        System.out.println(grades.length);
        
        System.out.println("\n\n");
        
        ArrayList<Integer> betterGrades = new ArrayList();
        betterGrades.add(100);
        betterGrades.add(90);
        betterGrades.add(80);
        System.out.println(betterGrades.size());
        betterGrades.add(70);
        betterGrades.add(60);
        betterGrades.add(50);
        betterGrades.add(40);
        System.out.println(betterGrades.size());
        betterGrades.remove(0);
        for (int grade : betterGrades) {
            System.out.println(grade);
        }
    }
    
}
