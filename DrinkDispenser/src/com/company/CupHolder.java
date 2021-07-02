package com.company;

import java.util.List;

public class CupHolder {

    private final int volume;
    private int cupQuantity;

    public CupHolder(int volume, int cupQuantity) {
        this.volume = volume;
        this.cupQuantity = cupQuantity;
    }

    public int dispenseCup() {
        cupQuantity--;
        return this.volume;
    }

    public void refill(int amt) {
        cupQuantity += amt;
    }


}
