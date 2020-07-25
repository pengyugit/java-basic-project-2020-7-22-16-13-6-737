package com.thoughtworks.basic;

public class CreditInstallmentPay extends Pay {
    private static String PAY_TYPE = "信用卡分期购物";

    @Override
    public void cost(int money) {
        int point = money/10;
        point = money>=5000?point+100:point;
        super.record(money,point,PAY_TYPE);
    }
}
