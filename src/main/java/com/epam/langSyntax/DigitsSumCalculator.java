package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int thousands = number / 1000;
        int hundreds = (number - thousands * 1000) / 100;
        int tens = (number - (hundreds * 100 + thousands * 1000)) / 10;
        int ones = number - (hundreds * 100 + tens * 10 + thousands * 1000);
        System.out.println(thousands + hundreds + tens + ones);
    }

}
