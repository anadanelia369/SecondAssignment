package org.example.task4;

public abstract class Mother {

    abstract void firstName();

    abstract void age();

    void lastName(String lastName) {
        System.out.println("you last name is " + lastName);
    }
    void nickName(String nickName) {
        System.out.println("you nick name is " + nickName);
    }
}
