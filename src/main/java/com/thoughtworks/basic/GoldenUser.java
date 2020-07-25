package com.thoughtworks.basic;

public class GoldenUser implements User {

    @Override
    public int calculatePoints(int points) {
        return (int) (points*1.5);
    }
}
