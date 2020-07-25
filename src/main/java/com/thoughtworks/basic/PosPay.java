package com.thoughtworks.basic;

public class PosPay implements Pay {
    private int points;

    @Override
    public void cost(int money) {
        points += money/10;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
