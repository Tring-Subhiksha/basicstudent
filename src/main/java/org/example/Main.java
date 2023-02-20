package org.example;
import java.util.*;
import java.util.logging.*;
class Student{
    String stuname;
    String grade;
    double gpa;
    double gradeValue;
    double credit;
    double mark;
    Logger l = Logger.getLogger("com.api.jar");
    Student(){
        Scanner sc=new Scanner(System.in);
        l.info("\nEnter Your Name:");
        stuname=sc.nextLine();
        l.info("\nEnter the Grade level:");
        grade=sc.nextLine();

        l.info("\nEnter the Credit points:");
        credit=sc.nextDouble();
    }
    String showdetails()
    {
        l.log(Level.INFO, () ->"\nStudent Name:" +stuname);
        l.log(Level.INFO, () ->"\nGrade Level:" +grade);
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
            default -> l.info("Invalid Grade");
        }
    }
    void updategpa(){
        mark=gradeValue*credit;
        gpa=mark/credit;
    }
}
class Basicstudent{
    public static void main(String[] args){
        Student s=new Student();

        s.checkgrade();
        s.updategpa();
        l.info(s.showdetails());

    }
}
