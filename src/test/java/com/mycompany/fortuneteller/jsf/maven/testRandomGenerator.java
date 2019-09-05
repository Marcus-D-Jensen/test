package com.mycompany.fortuneteller.jsf.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRandomGenerator {
    
    RandomGenerator rg = new RandomGenerator();
    @Test
    public void testwhatFactorToConsider(){
        for(int x=0; x<100; x++){
            assertTrue((rg.whatFactorToConsider()>-1) && (rg.whatFactorToConsider() < 4));
        }
    }
    
    @Test
    public void testgetOneRandomNumber(){
        for(int x=0; x<100; x++){
            assertTrue(rg.getOneRandomNumber() < 101 && rg.getOneRandomNumber() > -1);
        }
    }
    @Test
    public void testgetTwoRandomNumbers(){
        for(int x=0; x<100; x++){
            
            int[] a = rg.getTwoRandomNumbers();
            assertTrue((a[0]>-1) && (a[0] < 101) && (a[1]>-1) && (a[1] < 101));
            
        }
    }
    
}
