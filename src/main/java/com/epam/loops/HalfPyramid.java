package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int space = 0; space < cathetusLength - row; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
