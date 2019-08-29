/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_class;

//import static day3_class.Example.mainiigaisA;

/**
 *
 * @author Karina
 */
public class Day3_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //1//
        Example bub = new Example();
        bub.stars();
        
        System.out.println("");
        
        //2//
        
        Example number = new Example();
        number.mainiigaisA(10);
        number.printA();
        
        Example number1 = new Example();
        number1.printA();
                
        //System.out.println(number);
        
        System.out.println("");
        
        //3//
        Example calcul = new Example();
        calcul.kalkulators();
    }
    
    
    
    
}
