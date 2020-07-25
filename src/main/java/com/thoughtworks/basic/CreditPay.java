package com.thoughtworks.basic;

public class CreditPay extends Pay {
    private static String PAY_TYPE = "快捷支付";

    public CreditPay(User user) {
        super(user);
    }

    @Override
    public void cost(int money) {
        int points = super.getUser().calculatePoints(getBasePoint(money));
        int extraPoint=(money/100)*5;
        points += Math.min(100,extraPoint);
        super.record(money,points,PAY_TYPE);
    }

    public int getBasePoint(int money){
        return money/10;
    }
}
