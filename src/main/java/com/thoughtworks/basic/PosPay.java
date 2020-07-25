package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PosPay extends Pay {
    private static String PAY_TYPE = "POS机";

    public PosPay(User user) {
        super(user);
    }

    @Override
    void cost(int money) {
        int points = super.getUser().calculatePoints(getBasePoint(money));
        super.record(money,points,PAY_TYPE);
    }

    public int getBasePoint(int money){
        return money/10;
    }
}
