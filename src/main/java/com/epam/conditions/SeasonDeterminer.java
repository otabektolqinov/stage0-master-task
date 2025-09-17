package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("Winter");
        } else if (monthNumber == 0){
            System.out.println("Wrong month number");
        }else if (monthNumber >= 3 && 5>= monthNumber) {
            System.out.println("Spring");
        } else if (monthNumber >= 6 && 8 >= monthNumber){
            System.out.println("Summer");
        } else if (monthNumber >= 9 && 11 >= monthNumber) {
            System.out.println("Autumn");
        }
    }

}
