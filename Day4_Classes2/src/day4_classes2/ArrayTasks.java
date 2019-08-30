/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4_classes2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class ArrayTasks {

    public static void switchPlaces() {
        int a = 5;
        int b = 4;

        int c = a;
        a = b;
        b = c;

        System.out.println(a + " " + b);
    }

    public static void sortArray() {
        int[] arr = {7, 6, 3, 2, 9, 13};
        
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                
            }
        }
        
        
        
        Arrays.sort(arr); 
        
        System.out.println(Arrays.toString(arr));
  
        //sakartot masiivu augoshaa seciiaa un izvadiit
    }

    public static void sumOfElements() {
        //uztaisiit masiivu ar 5 elementiem, elementus ievada cilveeks
        //izvadiit masiivu
        //izvadam elementu summu
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ievadiet skaitli:");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];

        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
            System.out.println(Arrays.toString(arr));
        
//        for (int num : arr) {
//            sum = sum + num;
//        }
        System.out.println("Summa ir:"+sum);
    }
}
