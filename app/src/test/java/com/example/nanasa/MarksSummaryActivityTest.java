package com.example.nanasa;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarksSummaryActivityTest  {


private MarksSummaryActivity  MSA;



    @Before
    public  void setup(){
        MSA = new MarksSummaryActivity();
    }

    @Test
    public void testMultiplyNumbers(){
        int result = MSA.multiplicationMarks(300,3);
        assertEquals(900,result);

    }
    @Test
    public void testAddNumbers(){
        int result = MSA.addMarks(2,1);
        assertEquals(3,result);

    }

}
