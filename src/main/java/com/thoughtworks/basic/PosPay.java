package com.thoughtworks.basic;

public class PosPay implements Pay {


    @Override
    public int cost(int money) {
        return money/10;
    }
}
