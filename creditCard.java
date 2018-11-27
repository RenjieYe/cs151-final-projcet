/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;

/**
 *
 * @author renjie
 */
public abstract class creditCard {
     String creditCardNum;
     String creditCardTpye;
     public creditCard (String creditCardNum){
       this.creditCardNum = creditCardNum;
    }
     public String getType(){
         return creditCardTpye;
     }
    public String getcreditCardNum(){
        return creditCardNum;
    }
    
    
    
}
