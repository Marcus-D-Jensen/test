package com.mycompany.fortuneteller.jsf.maven;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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

@ManagedBean
@SessionScoped
public class Person {
    
    private String message;
    
    private String namn;
    private String kon;
    private int alder;
    private String jobb;

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getJobb() {
        return jobb;
    }

    public void setJobb(String jobb) {
        this.jobb = jobb;
    }
    
    

    public String getKon() {
        return kon;
    }

    public void setKon(String kon) {
        this.kon = kon;
    }
    

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }
    
    public void generateMessage(){
        RandomGenerator RG = new RandomGenerator();
        int decidingFactor = RG.whatFactorToConsider();
        int randomNumber = RG.getOneRandomNumber();
        
        Translator t = new Translator(this, decidingFactor, randomNumber);
        
        
        //UNcomment to see that the button works 
//        if(namn.contains("marcus")){
//            message="Ratt namn!";
//        }
//        else if (namn.contains("sandra")){
//            message="Det var ett valdigt fint namn!";
//        }
//        else{
//            message="Fel namn!";
//        }

        //Uncomment below to see that the proper things are put into the right variabels
        //message+=", namn: " + namn + ", alder: " + alder + ", kon: " + kon + ", jobb: " + jobb;
        
        message=t.getMessage();
    }
    
    
    

}
