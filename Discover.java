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
public class Discover extends creditCard{
    private String CreditCardNum;
    private final String cardType = "Discover";
    public Discover(String creditCardNum) {
        super(creditCardNum);
        this.creditCardTpye = "Discover";
    }
        

    // Discover: First four digits are 6011. Length is 16 digits.
    static boolean isDiscoverz(String CreditCardNum){
        if (CreditCardNum==null || CreditCardNum.isEmpty()) {
            return false;
        }
        return (CreditCardNum.length()==16 && CreditCardNum.startsWith("6011"));
    }


    
}
