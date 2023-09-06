package com.java.demo.intro;

public class SimpleArray {

    public static void main(String[] args) {

        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int b[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int c[][] = new int[3][3];

        c[i][j] += a[i][k] * b[k][j];

        int[] firstElement = {2, 4, 5};
        int[] secondElement = {24, 4, 5};
        int[] thirdElement = {2, 49, 5};

        int[][] twoDimensional = {firstElement, secondElement, thirdElement};

        for (int i = 0; i < twoDimensional.length; i++) {
            System.out.print("{");
            for (int j = 0; j < twoDimensional[i].length; j++) {
                System.out.print(twoDimensional[i][j] + "\t");
            }
            System.out.print("}");
            System.out.println();
        }
    }
}
