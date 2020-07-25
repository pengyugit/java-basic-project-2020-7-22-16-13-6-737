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


}
