/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs151hw4ry;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.SwingUtilities;


/**
 *
 * @author renjie
 */
public class CS151Hw4RY {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
//         ArrayList food = new ArrayList();//ReadFile will pass food names into this array list
//         ArrayList price = new ArrayList();//ReadFile will pass food price into this array list
    
        ReadFileControler test =new ReadFileControler();
        test.operFileReader();
        
        final ArrayList food = test.getfoodName();
        final ArrayList price = test.getfoodPrice();
        
        //System.out.print(food);
        
        SwingUtilities.invokeLater(() -> {
            View test1 = new View(food, price);
            test1.createAndShowGUI();
           
        });
 
        
     
      

        
    }
    
    
    
}

    