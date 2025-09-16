package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int ones = number - (hundreds * 100 + tens * 10);

        number = ones * 100 + tens * 10 + hundreds;
        System.out.println(number);
    }

}
