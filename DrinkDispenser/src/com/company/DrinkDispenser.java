package com.company;

import java.util.List;

public class DrinkDispenser {

    private List<Syrup> syrup;
    private List<Shots> shots;
    private List<CupHolder> cupHolder;

    public DrinkDispenser(List<Syrup> syrup, List<Shots> shots, List<CupHolder> cupHolder){
        this.syrup=syrup;
        this.shots=shots;
        this.cupHolder=cupHolder;
    }
}
