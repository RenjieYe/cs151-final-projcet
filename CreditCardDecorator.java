/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is the class of credit card decorator.
 * Demo of decorator design pattern.
 *
 * @author renjie, Jing Zhao
 */
public class CreditCardDecorator extends CreditCard {
    /**
     * The credit card to be decorated.
     */
    CreditCard creditCard;
    
    /**
     * The expiration date;
     */
    String expirationDate;

    /**
     * Constructor.
     * 
     * @param creditCardNum
     *      the credit card number.
     */
    public CreditCardDecorator(CreditCard creditCard, String expirationDate) {
        super(creditCard.getCreditCardNum());
        this.creditCardTpye = creditCard.getType();
        this.creditCard = creditCard;
        this.expirationDate = expirationDate;
    }
    
    /**
     * Validate if the card is expired.
     * 
     * @param exprationDate
     *      the expiration date of the credit card, in the format of MM/YY.
     * @return
     *      true is expired false otherwise.
     */
    public boolean validate() {
        if (!creditCard.validate()) {
            return false;
        }
        try {
            DateFormat formatter;
            formatter = new SimpleDateFormat("MM/YY");
            Date date = (Date) formatter.parse(expirationDate);
            if (date.before(new Date())) {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
