/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.swing.SwingUtilities;

/**
 * This is the application entry.
 *
 * @author renjie, Jing Zhao.
 */
public class CS151Hw4RY implements Runnable{

    /**
     * @param args
     *            the command line arguments
     * @throws java.io.FileNotFoundException
     * @throws SecurityException 
     * @throws NoSuchMethodException 
     * @throws InvocationTargetException 
     * @throws IllegalArgumentException 
     * @throws IllegalAccessException 
     */
    public static void main(String[] args) throws 
            FileNotFoundException, 
            NoSuchMethodException, 
            SecurityException, 
            IllegalAccessException, 
            IllegalArgumentException, 
            InvocationTargetException {
        ReadFileController menu = new ReadFileController();
        // Invoke the method using reflection.
        Class<? extends ReadFileController> cls = menu.getClass();
        Method readMenuMethod = cls.getDeclaredMethod("readMenu", 
                String.class); 
        readMenuMethod.invoke(menu, "menu.txt"); 

        final List<String> food = menu.getfoodName();
        final List<Double> price = menu.getfoodPrice();

        SwingUtilities.invokeLater(() -> {
            View view = new View(food, price);
            view.createAndShowGUI();
        });
        
        runThread();

    }
    
    @Override
    public void run() {
       
        try {
            System.out.println("thread "+ Thread.currentThread().getId() +" is running");
        } catch (Exception e) {
            System.out.println("exception while thread running");
        }
       
    }
   
    //run the threads
    public synchronized static void runThread() {
        int n=8;
        for(int i=0; i<8;i++) {
            Thread obj = new Thread(new CS151Hw4RY());
            obj.start();
        }
 
    }

}
