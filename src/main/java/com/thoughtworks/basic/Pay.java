package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Pay {
    private int points;

    abstract void cost(int money);

    public void record(int money, int point,String payType) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date =df.format(new Date());
        String costInfo = date+" "+payType+"消费 "+money+"元，积分 +"+point;
        points+=point;
        System.out.println(costInfo);
    }

    public int getPoints(){
        System.out.println("总积分："+points);
        return points;
    }
}
