package com.example.settesting;

import org.junit.Assert;
import org.junit.Test;


//requirement
//Do your own Set implementation (using arrays) with TDD pair programming
//Set bag of elements
//add elements
//add method to add

//todo
//should not contain duplicates
//add should return false and should not add element into array

public class MySetTest {

    @Test
    public void firstTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.add(1); // adding element
        boolean expectedValue = true;

        Assert.assertEquals(expectedValue, actualValue);


    }

    @Test
    public void secondTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.contains(1); // should return true if 1 is added
        boolean expectedValue = true;

        Assert.assertEquals(expectedValue, actualValue);


    }

    @Test // negative cases
    public void thirdTest() {
        MySet mySet = new MySet();
        mySet.add(1);
        boolean actualValue = mySet.contains(2); // should return false as we have not added 2
        boolean expectedValue = false;

        Assert.assertEquals(expectedValue, actualValue);


    }
}
