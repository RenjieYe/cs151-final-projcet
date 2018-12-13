/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;

/**
 * This class means American Express credit card.
 *
 * @author renjie, Jing Zhao
 */
public class AmericanExpress extends CreditCard {

    /**
     * Constructor.
     * 
     * @param creditCardNum
     *      the credit card number.
     */
    public AmericanExpress(String creditCardNum) {
        super(creditCardNum);
        this.creditCardTpye = "AmericanExpress";
    }

    /**
     * Check if the credit card is American Express.
     * 
     * @param creditCardNum
     *      the credit card number.
     * @return
     *      true or false.
     */
    static boolean validate(String creditCardNum) {
        if (creditCardNum == null || creditCardNum.isEmpty()) {
            return false;
        }
        // AmericanExpress:First digit is a 3 and second digit a 4 or 7. Length
        // is 15 digits.
        if (creditCardNum.length() == 15 && creditCardNum.charAt(0) == '3'
                && (creditCardNum.charAt(1) == '4' || creditCardNum.charAt(1) == '7')) {
            return true;
        }
        return false;
    }

}
