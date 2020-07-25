package com.thoughtworks.basic;

public class WeChartPay extends Pay {
    private static String PAY_TYPE = "微信支付";

    @Override
    public void cost(int money) {
        int point = money/20;
        super.record(money,point,PAY_TYPE);
    }
}
