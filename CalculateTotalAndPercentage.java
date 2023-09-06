package com.demo;

public class CalculateTotalAndPercentage {

    public static void main(String[] args) {
        int[] marks = { 85, 90, 78, 92, 88 };

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double percentage = (double) totalMarks / marks.length;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
