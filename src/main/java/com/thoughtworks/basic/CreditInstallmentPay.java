package com.thoughtworks.basic;

public class CreditInstallmentPay extends Pay {
    private static String PAY_TYPE = "信用卡分期购物";

    public CreditInstallmentPay(User user) {
        super(user);
    }

    @Override
    public void cost(int money) {
        int points = super.getUser().calculatePoints(getBasePoint(money));
        points = money>=5000?points+100:points;
        super.record(money,points,PAY_TYPE);
    }

    public int getBasePoint(int money){
        return money/10;
    }

}
