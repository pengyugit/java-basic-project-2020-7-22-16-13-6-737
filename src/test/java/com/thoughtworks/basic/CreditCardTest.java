package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void should_return_1_points_when_cost_11_by_pos(){
        Pay posPay = new PosPay();

        int points = posPay.cost(11);

        Assert.assertEquals(1 ,points);
    }

    @Test
    public void should_return_1_points_when_cost_108_by_pos(){
        Pay posPay = new PosPay();

        int points = posPay.cost(108);

        Assert.assertEquals(10 ,points);
    }

    @Test
    public void should_return_1_points_when_cost_208_by_pos(){
        Pay posPay = new PosPay();

        int points = posPay.cost(208);

        Assert.assertEquals(20 ,points);
    }

    @Test
    public void should_return_0_points_when_cost_8_by_pos(){
        Pay posPay = new PosPay();

        int points = posPay.cost(8);

        Assert.assertEquals(0 ,points);
    }




}
