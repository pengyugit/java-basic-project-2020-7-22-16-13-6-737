package com.thoughtworks.basic;

public class CreditPay extends Pay {
    private static String PAY_TYPE = "快捷支付";

    @Override
    public void cost(int money) {
        int point = money/10;
        int extraPoint=(money/100)*5;
        point += extraPoint>=100?100:extraPoint;
        super.record(money,point,PAY_TYPE);
    }
}
