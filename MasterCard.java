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
public class MasterCard extends creditCard {
    private String CreditCardNum;
    public MasterCard(String creditCardNum) {
        super(creditCardNum);
        this.creditCardTpye = "MasterCard";
    }
        

    
    //MasterCard: First digit is a 5, second digit is in range 1 through 5 inclusive. 
    //Only valid lenght of number is 16 digits.
     static boolean  isMasterCard(String CreditCardNum){
        if (CreditCardNum==null || CreditCardNum.isEmpty()) {
            return false;
        }
        if (CreditCardNum.length()==16 && CreditCardNum.charAt(0) == '5'&& CreditCardNum.charAt(1) >= '1' && CreditCardNum.charAt(1) <= '5')
            return true;
        return false;
        
    }


}
