package com.thoughtworks.basic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Pay {
    private static int points;
    private static List<String > payInfo = new ArrayList<>();
    private User user;

    public Pay(User user) {
        this.user = user;
    }

    abstract void cost(int money);

    public void record(int money, int point,String payType) {
        points+=point;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date =df.format(new Date());
        payInfo.add(date+" "+payType+"消费 "+money+"元，积分 +"+point);
    }

    public static int getPoints(){
        return points;
    }
    public static void printPayInfo(Print print){
        print.printInfo(payInfo,points);
    }

    public User getUser() {
        return user;
    }

    public static void clearPoints() {
        points = 0;
    }
}
