/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_classes2;

/**
 *
 * @author Karina
 */
public class Day4_Classes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Daudzsturi dst = new Daudzsturi();
        dst.setMaluSkaits(3);
        dst.setMalas(7, 3, 1, 5);
//        dst.setMalas(0, 0, 0);
        
        System.out.println("Perimetrs ir:" + dst.getPerimetrs());
        
        ArrayTasks.sortArray();
        
        ArrayTasks.switchPlaces();
        
        ArrayTasks.sumOfElements();
        
        
        
        
    }
    
   
    
//    public static void IzrekinamPerimetru(){
//        Daudzsturi perimetrs = new Daudzsturi();
//        perimetrs.perimetrs(0);
//        System.out.println(perimetrs);
//    }
}
