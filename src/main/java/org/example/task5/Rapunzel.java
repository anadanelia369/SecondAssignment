package org.example.task5;

public class Rapunzel implements StepMother, Father, Mother {

    @Override
    public void protect() {
        System.out.println("Mother always protects me");
    }

    @Override
    public void care() {
        System.out.println("Mother cares about me");
    }

    @Override
    public void search() {
        System.out.println("My father is searching for me");
    }

    @Override
    public void support() {
        System.out.println("Father supports me");
    }

    @Override
    public void manipulate() {
        System.out.println("Mother knows best");
    }

    @Override
    public void control() {
        System.out.println("Stay in the tower!");
    }
}
