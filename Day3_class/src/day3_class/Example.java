/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3_class;

import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class Example {

    private int a;

    public Example() {
        a = 0;

    }
    public void mainiigaisA(int number) {
        a = number;
        
        if (number < 5 || number > 15) {
            a = 99;
        }
        
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ievadiet skaitli");
//        int a = sc.nextInt();
//        System.out.println("Veertiba a ir: " + a);
    }
public void printA(){
    System.out.println(a);
}
    //private - tikai ieksh shiis klase
    //public - ieksh dokumenta
    //static - uz bjektu veersta, non static - more variables
    public void whileExample() {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        while (!exit.equals("yes")) {
            System.out.println("Izvade!");
            exit = sc.nextLine();
            exit = exit.toLowerCase();
        }
    }
    //uztaisam klasi tasks
    //statiska etode, kas izvada piramiidu ar *

    public static void stars() {

        String output = "";
        for (int i = 0; i < 4; i++) {
            output = output + "*";

            System.out.println(output);
        }
        for (int i = 3; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // uztaisiit lauku(int) ar nosqaukumu a
    // konstruktora iedodat veertiibu 0; metode ar paramertu, kas maina veertiibu mainiigajam a
    //uzd. >> uztaisiit kalkulatoru
    // matematiskas darbiibas jaunaa klasee
    //veertiibas padodam ar parametriem un rezultaatu atgriezham ar return
    //main metodee >> Day3 klasee, izmantojam while cikl, lai uzstaisiit menu
    public static void kalkulators() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet vēlamās operācijas nr.");
        System.out.println("1 - summa");
        System.out.println("2 - starpiba");
        System.out.println("3 - reizinajums");
        System.out.println("4 - daliijums");
        System.out.println("5 - atlikums");
        int number = sc.nextInt();

        if (number == 1) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();

            System.out.println("Ievadiet skaitli");
            int b = sc.nextInt();

            System.out.println("Summa: " + (a + b));
        } else if (number == 2) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();

            System.out.println("Ievadiet skaitli");
            int b = sc.nextInt();

            System.out.println("Starpība: " + (a - b));
        } else if (number == 3) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();

            System.out.println("Ievadiet skaitli");
            int b = sc.nextInt();
            System.out.println("Reizinājums: " + (a * b));
        } else if (number == 4) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();

            System.out.println("Ievadiet skaitli");
            int b = sc.nextInt();
            System.out.println("Dalījums: " + (a / b));

        } else if (number == 5) {
            System.out.println("Ievadiet skaitli");
            int a = sc.nextInt();

            System.out.println("Ievadiet skaitli");
            int b = sc.nextInt();
            System.out.println("Dalījums: " + (a % b));
        } else {
            System.out.println("Nepareizi ievaditais operacijas numurs");
        }

    }

    
}
