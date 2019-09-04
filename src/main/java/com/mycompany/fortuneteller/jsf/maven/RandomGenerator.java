package com.mycompany.fortuneteller.jsf.maven;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author marcu
 * aer awesome
 */


public class RandomGenerator {
    
    //This is how many questions there are on the form
    private int antalFaktorer = 4;
    
    //completely random number between 1 and 100
    private int randomNumber;
    
    //this method decides which answer on the form that should be considered
    public int whatFactorToConsider(){
        int a = (int)(Math.random()*antalFaktorer);
        return a;
    }
    
    public int getOneRandomNumber(){
        int a = (int)(Math.random()*100)+1;
        return a;
    }
    
    public int[] getTwoRandomNumbers(){
        int[] a = new int[2];
        a[0] = (int)(Math.random()*100)+1;
        a[1] = (int)(Math.random()*100)+1;
        return a;
    }

}
