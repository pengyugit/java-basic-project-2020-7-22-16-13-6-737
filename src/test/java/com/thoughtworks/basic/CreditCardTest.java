package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardTest {
    @Before
    public void initialize() {
        Pay.clearPoints();
    }
    @Test
    public void should_return_1_points_when_cost_11_by_pos(){
        Pay posPay = new PosPay();

        posPay.cost(11);

        Assert.assertEquals(1 ,Pay.getPoints());
    }

    @Test
    public void should_return_1_points_when_cost_108_by_pos(){
        Pay posPay = new PosPay();

        posPay.cost(108);

        Assert.assertEquals(10 ,Pay.getPoints());
    }

    @Test
    public void should_return_1_points_when_cost_208_by_pos(){
        Pay posPay = new PosPay();

        posPay.cost(208);

        Assert.assertEquals(20 ,Pay.getPoints());
    }

    @Test
    public void should_return_0_points_when_cost_8_by_pos(){
        Pay posPay = new PosPay();

        posPay.cost(8);

        Assert.assertEquals(0 ,Pay.getPoints());
    }

    @Test
    public void should_return_30_points_when_costs_by_pos(){
        Pay posPay = new PosPay();

        posPay.cost(208);
        posPay.cost(108);
        posPay.cost(8);

        Assert.assertEquals(30 ,Pay.getPoints());
    }


    @Test
    public void should_return_1_points_when_cost_25_by_wechart(){
        Pay weChartPay = new WeChartPay();

        weChartPay.cost(25);

        Assert.assertEquals(1 ,Pay.getPoints());
    }

    @Test
    public void should_return_32_points_when_costs_by_pos_and_wechart(){
        Pay posPay = new PosPay();
        Pay weChartPay = new WeChartPay();

        weChartPay.cost(25);
        weChartPay.cost(18);
        posPay.cost(108);
        weChartPay.cost(10);
        weChartPay.cost(22);
        posPay.cost(208);

        Assert.assertEquals(32 ,Pay.getPoints());
    }
}
