package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PosPay extends Pay {
    private static String PAY_TYPE = "POS机";

    @Override
    public void cost(int money) {
        int point = money/10;
        super.record(money,point,PAY_TYPE);
    }


}
