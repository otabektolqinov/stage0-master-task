package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int space = 0; space < cathetusLength - row; space++) {
                System.out.print(" ");
            }

            for (int num = row; num >= 1; num--) {
                System.out.print(num);
            }

            for (int num = 2; num <= row; num++) {
                System.out.print(num);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
