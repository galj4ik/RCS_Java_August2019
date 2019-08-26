/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2_loops;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Day2_loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //loops();
        //stars();
        //sumOfNumbers();
        //factorial();
        max();
    }

    public static void loops() {
        //for, while, for-each, do..while

        for (int i = 0; i < 5; i++) {
            System.out.println(i * 5);
        }
    }

    public static void stars() {
//       int i, j; 
//  
//        // outer loop to handle number of rows 
//        //  n in this case 
//        for(i=0; i<4; i++) 
//        { 
//  
//            //  inner loop to handle number of columns 
//            //  values changing acc. to outer loop     
//            for(j=0; j<=i; j++) 
//            { 
//                // printing stars 
//                System.out.print("*"); 
//            } 
//  
//            // ending line after each row 
//            System.out.println(); 
//        } 
        String output = "";
        for (int i = 0; i < 4; i++) {
            output = output + "*";
            //skaitljiem
            //output = output + (i+1);
            System.out.println(output);
        }

    }

    public static void sumOfNumbers() {

        Scanner sc = new Scanner(System.in);
        //cilveks ievada 3 skaitljus
        // skaitli tiek saskaititi 
        // + jausglaba kur glbaat summu 
        //ciklaa ljaujam ievadiit skaitli
        // pieskaitam summai
        //aarpus cikla summa ir jaaizvada

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ievadiet skaitli:");
            int number = sc.nextInt();
            sum = sum + number;
        }
        System.out.println("Summa ir : " + sum);
    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet skaitli:");
        int number = sc.nextInt();
        int i, fact = 1;

        //for cikls, kas aprekina faaktorialu
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Faktorials numuram  " + number + " ir: " + fact);

    }

    public static void max() {

        Scanner sc = new Scanner(System.in);

        
        int minMax = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ievadiet skaitli:");
            int number = sc.nextInt();

            if (number > minMax) {
                minMax = number;
            }

        }
        System.out.println(minMax);

//        Scanner sc = new Scanner(System.in);
// >>> shis izvada arii negatiivos skaitljus
//        int newInput = Integer.MIN_VALUE;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ievadi skaitli");
//            int input = sc.nextInt();
//            if (input > newInput) {
//                newInput = input;
//            }
//
//        }
//        System.out.println(newInput);
    }
}
