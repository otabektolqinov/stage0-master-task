package com.epam.OOP;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        if (hasFur){
            if (numberOfPaws > 1)
                return String.format("This animal is mostly %s. It has %d paws and a fur.", color, numberOfPaws);
            else
                return String.format("This animal is mostly %s. It has %d paw and a fur.", color, numberOfPaws);
        }
        return String.format("This animal is mostly %s. It has %d paws and no fur.", color, numberOfPaws);
    }

}
