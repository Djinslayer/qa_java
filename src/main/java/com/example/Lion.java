package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;

    private Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    //Feline feline = new Feline();

    public int getKittens(Feline feline) {
        this.feline = feline;
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood(Feline feline) throws Exception {
        this.feline = feline;
        return feline.getFood("Хищник");
    }
}
