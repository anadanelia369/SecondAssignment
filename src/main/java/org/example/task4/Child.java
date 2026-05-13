package org.example.task4;

class Child extends Mother {

    @Override
    void firstName() {
        System.out.println("George");
    }
    @Override
    void age() {
        System.out.println(20);
    }

    public String  favoriteColor = "Red";
    private int year = 2007;
    boolean genderIsMale = true;


    public void setYear(int newYear) {
        year = newYear;
    }






}