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
public class AmericanExpress extends creditCard{
    String CreditCardNum;
    
        public AmericanExpress(String creditCardNum) {
        super(creditCardNum);
        this.creditCardTpye = "AmericanExpress";
    }
        

    
    static boolean isAmericanExpress(String CreditCardNum){
        if (CreditCardNum==null || CreditCardNum.isEmpty()) {
            return false;
        }
        //AmericanExpress:First digit is a 3 and second digit a 4 or 7. Length is 15 digits.
        if(CreditCardNum.length()==15 && CreditCardNum.charAt(0)=='3' && (CreditCardNum.charAt(1)=='4'  || CreditCardNum.charAt(1)=='7')){
            return true;
        }
            return false;
    } 


    
     
}
