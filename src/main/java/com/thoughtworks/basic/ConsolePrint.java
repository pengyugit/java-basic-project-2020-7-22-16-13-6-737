package com.thoughtworks.basic;

import java.util.List;

public class ConsolePrint implements Print{
    @Override
    public void printInfo(List<String> info,int points) {
        System.out.println("总积分："+points);
        for(String i:info){
            System.out.println(i);
        }
    }
}
