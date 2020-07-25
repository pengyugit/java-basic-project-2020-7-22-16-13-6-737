package com.thoughtworks.basic;

import java.util.List;

public class HtmlPrint implements Print{
    @Override
    public void printInfo(List<String> info,int points) {
        System.out.println("<h2>总积分：<b>"+points+"</b></h2>");
        for(String i:info){
            System.out.println("<p>"+i+"<p>");
        }
    }
}
