package com.company;

public class Syrup{
    private String drinkName;
    private int liquidAmount;

    public Syrup(String drinkName, int liquidAmount){
        this.drinkName=drinkName;
        this.liquidAmount=liquidAmount;
    }

    public String dispense(int amt){
        liquidAmount-=amt;
        return this.drinkName;
    }

    public int getVolume() {
        return liquidAmount;
    }

}
