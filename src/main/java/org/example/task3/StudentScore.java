package org.example.task3;

public class StudentScore {

    public static void main(String[] args) {

        int[] studentScore = {100, 75, 89, 76, 0, 5};

        for (int i = 0; i < studentScore.length; i++) {

            if (studentScore[i] > 75) {

                System.out.println(studentScore[i]);
            }

        }
    }
}