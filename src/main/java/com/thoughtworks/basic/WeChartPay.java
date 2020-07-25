package com.thoughtworks.basic;

public class WeChartPay extends Pay {
    private static String PAY_TYPE = "微信支付";

    public WeChartPay(User user) {
        super(user);
    }

    @Override
    public void cost(int money) {
        int points = super.getUser().calculatePoints(getBasePoint(money));
        super.record(money,points,PAY_TYPE);
    }

    public int getBasePoint(int money){
        return money/20;
    }
}
