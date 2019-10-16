package gradesrock;

import java.util.ArrayList;

public class Student {

    public static String databaseIp = "192.168.1.1";
    
    private String name;
    private int studentId;
    private String classLevel;
    private ArrayList<Double> grades;

    private Student() {
        this.name = "";
        this.studentId = -1;
        this.classLevel = "Unknown";
        this.grades = new ArrayList();
    }

    public Student(int studentId, String name, String classLevel) {
        this();
        this.name = name;
        this.studentId = studentId;
        this.classLevel = classLevel;
    }
    
    public void printGrades() {
        System.out.println(this.name + "'s grades: ");
        System.out.println("-----------------------");
        for (int i =0; i< this.grades.size(); ++i) {
            System.out.println((i+1) + ": " + this.grades.get(i));
        }
    }
    
    @Override
    public String toString() {
        return this.studentId + ": " + this.name + " -- " + this.classLevel;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    
    public int getGradeCount() {
        return this.grades.size();
    }
    
    public double getCurrentAverage() {
        double sum = 0;
        for (double grade : this.grades) {
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public double dropLowest() {
        
        if (this.grades.size() < 1) {
            return -1;
        }
        
        int lowestIndex = -1;
        double lowestVal = 1000000000;
        for (int i = 0; i < this.grades.size(); ++i) {
            double currentGrade = this.grades.get(i);
            if (currentGrade < lowestVal) {
                lowestVal = currentGrade;
                lowestIndex = i;
            }
        }
        
        this.grades.remove(lowestIndex);
        return lowestVal;
    }

    // ** STANDARD GETTERS AND SETTERS ** 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(String classLevel) {
        this.classLevel = classLevel;
    }
}
