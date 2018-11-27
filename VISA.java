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
public class VISA extends creditCard{
    private String CreditCardNum;
    
//    public VISA(String CreditCardNum){
//        this.CreditCardNum =  CreditCardNum;
//    }
    public VISA(String creditCardNum) {
        super(creditCardNum);
        this.creditCardTpye = "VISA";
    }
    
        

    
    //visa:  	First digit is a 4. Length is either 13 or 16 digits.
    static boolean isVISA(String CreditCardNum){
        if (CreditCardNum==null || CreditCardNum.isEmpty()) {
            return false;
        }
        if (CreditCardNum.charAt(0)=='4' && (CreditCardNum.length()==16 || CreditCardNum.length()==13)){
            return true;
        }
        return false;
    }


    
        
    }
