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


public class Translator {
    
    private Person person;
    
    int decidingFactor;
    
    int randomNumber;

    public Translator(Person person, int decidingFactor, int randomNumber) {
        this.person = person;
        this.decidingFactor = decidingFactor;
        this.randomNumber = randomNumber;
    }
    
    public String getTemporaryMessage(){
        return "This is a temporary standard message";
    }
    
    public String getMessage(){
        String mes="";
        
        switch(decidingFactor){
            
            case 0:{//The name decides the message
                mes=getMessageByName();
                break;
            }
            case 1:{//Age decides the message
                mes=getMessageByAge();
                break;
            }
            case 2:{//occupasion decides the message
                mes=getMessageByOccupation();
                break;
            }
            case 3:{//gender decides the message
                mes=getMessageByGender();
                break;
            }
            
        }
        return mes;
    }

    public String getMessageByName() {
     if(person.getNamn().contains("sandra")){
         return "Det var ett fint namn!";
     }
     else if (person.getNamn().contains("marcus"))
         return "Ett ordentligt namn!";
     else if (person.getNamn().contains("a"))
         return "Ja det ar ju ocksa ett okej namn";
     else
         return "Njea det namnet godkanner vi inte riktigt.";
    }
    

    public String getMessageByAge() {
        if(person.getAlder() < 18)
            return "Du ar inte gammal nog for att vara har!";
        else if (person.getAlder() > 80)
            return "oj du var gammal du!";
        else
            return "Du ar i livets gyllende ar, vad trevligt!";
    }

    public String getMessageByGender() {
        if(person.getKon().equalsIgnoreCase("horse"))
            return "HORSE IS NOT A GENDER STUPID";
        else if (person.getKon().equalsIgnoreCase("man"))
            return "Oj vilka stora muskler du har!";
        else if (person.getKon().equalsIgnoreCase("woman"))
            return "Vilket fint hår du har";
        else
            return "Du ser bra ut idag!";
    }

    public String getMessageByOccupation() {
        if(person.getJobb().contains("prog"))
            return "Du ar en del av framtiden du!";
        else if (person.getJobb().contains("rar"))
            return "Du skapar framtidens ledare du!";
        else if (person.getJobb().contains("e"))
            return "Oj du har en bra framtid du!";
        else if(person.getJobb().contains("a"))
            return "Hoppas ditt jobb gar bra!";
        else
            return "Konstigt jobb det dar?";
    }

}
