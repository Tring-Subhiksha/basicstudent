package org.example;
import java.util.*;
class Student{
    String stuname;
    String grade;
    double gpa;
    double gradeValue;
    double credit;
    double mark;
    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Your Name:");
        stuname=sc.nextLine();
        System.out.println("\nEnter the Grade level:");
        grade=sc.nextLine();

        System.out.println("\nEnter the Credit points:");
        credit=sc.nextDouble();
    }
    String showdetails()
    {
        System.out.println("\nStudent Name:" +stuname);
        System.out.println("\nGrade Level:" +grade);
        return stuname+" has a "+gpa+" GPA";
    }
    void checkgrade(){


        switch (grade) {
            case "A" -> gradeValue = 4.00;
            case "A-" -> gradeValue = 3.67;
            case "B+" -> gradeValue = 3.33;
            case "B" -> gradeValue = 3.00;
            case "B-" -> gradeValue = 2.67;
            case "C+" -> gradeValue = 2.33;
            case "C" -> gradeValue = 2.00;
            default -> System.out.println("Invalid Grade");
        }
    }
    void updategpa(){
        mark=gradeValue*credit;
        gpa=mark/credit;
    }

    public static void main(String[] args){
        Student s=new Student();

        s.checkgrade();
        s.updategpa();
        System.out.println(s.showdetails());

    }
}
