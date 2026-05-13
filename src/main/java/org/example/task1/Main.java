package org.example.task1;

public class Main {

    public static void main(String[] args){

        Student student1 = new Student();
        student1.name = "Anna";
        student1.age = 39;
        student1.courseName = "Automation";
        student1.printInfo();
        student1.printStudentInfo();
        System.out.println("სტუდენტი " + student1.name + " არის " + student1.age+ " წლის" + " და " + "სწავლობს " + student1.courseName + "-კურსზე");

    }
}
