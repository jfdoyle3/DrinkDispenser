package com.company;

public class Syrup{
    private String drinkName;
    private int liquidAmount;

    public Syrup(String drinkName, int liquidAmount){
        this.drinkName=drinkName;
        this.liquidAmount=liquidAmount;
    }

    public void dispense(int amt){
        liquidAmount=amt;
    }

    public int getVolume() {
        return liquidAmount;
    }

}
