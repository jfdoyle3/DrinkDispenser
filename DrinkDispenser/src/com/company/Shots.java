package com.company;

public class Shots {
    private String flavorName;
    private int liquidAmount;
    private int shotSize;

    public Shots(String flavorName, int liquidAmount, int shotSize) {
        this.flavorName = flavorName;
        this.liquidAmount = liquidAmount;
        this.shotSize=shotSize;
    }

    public String dispense(int amt){
        liquidAmount=-amt;
        return this.flavorName;
    }

    public int getVolume(){
      return liquidAmount-shotSize;

    }

}
