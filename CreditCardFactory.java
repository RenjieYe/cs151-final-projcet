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
public class CreditCardFactory extends creditCard{
    public CreditCardFactory(String creditCardNum) {
        super(creditCardNum);
    }
    
    
    static creditCard createCard(String CreditCardNum){
      
        if (VISA.isVISA(CreditCardNum) ){
            return new VISA(CreditCardNum);
        }
        else if (Discover.isDiscoverz(CreditCardNum)){
            return new Discover(CreditCardNum);
            }
        else if (MasterCard.isMasterCard(CreditCardNum)){
            return new MasterCard(CreditCardNum);
        }
        else if (AmericanExpress.isAmericanExpress(CreditCardNum)){
            return new AmericanExpress(CreditCardNum);
        }return null;
    }


}
