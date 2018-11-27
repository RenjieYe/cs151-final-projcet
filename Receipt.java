/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;

import java.util.ArrayList; 
/**
 *
 * @author renjie
 */
public class Receipt {
    
    private ArrayList<String> reciptFood = new ArrayList<>();
    private ArrayList<Double> reciptPrice = new ArrayList<>();
    
    private creditCard receiptCard = null; //need to pass a creditcard obj in to this class
    private double total = 0;
    public void setCreditCard(creditCard receiptCard) {
        this.receiptCard = receiptCard;
    }
    
    public void addItem(String food, Double price) {
        reciptFood.add(food);
        reciptPrice.add(price);
        total+=price;
    }
    
    public double getTotal() {
        return total;
    }
    
    public void clear() {
        reciptFood.clear();
        reciptPrice.clear();
        total = 0;
        receiptCard = null;
    }
    public String getReceiptString() {
        if (receiptCard==null) {
            return "Invalid Credit Card Number!";
        }
        if (reciptFood.isEmpty()) {
            return "Nothing in the Receipt!";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<reciptFood.size(); i++){
            sb.append(reciptFood.get(i)).append(" ").append(reciptPrice.get(i)).append("\n");
        }
        sb.append("your total is :").append(total).append("\n");
        sb.append("your payment card is: ").append(receiptCard.getType()).append("\n");
        return sb.toString();
    }
    
}
