package com.example.settesting;

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void firstTest(){
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.add(1);
        boolean expectedValue = true;

        Assert.assertEquals(expectedValue, actualValue);


    }

    @Test
    public void secondTest(){
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.contains(1);
        boolean expectedValue = true;

        Assert.assertEquals(expectedValue, actualValue);


    }

    @Test // negative cases
    public void thirdTest(){
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.contains(2);
        boolean expectedValue = false;

        Assert.assertEquals(expectedValue, actualValue);


    }
}
