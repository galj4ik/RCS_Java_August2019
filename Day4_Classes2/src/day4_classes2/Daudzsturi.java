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
public class Daudzsturi {

    private double a, b, c, d;
    private int maluSkaits;

    // 1, uztaisit konstruktoru, kas pieshkir visiem mainiigajiem veertiibu 0, 
    public Daudzsturi() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        maluSkaits = 0;

    }

    // 2, uztaisiit veel vienu privaato mainiigo, kas atbild par malu skaitu
    // 3, malu skaitam uztaisiit set metodi (setaA(int number)
    public void setMaluSkaits(int value) {
        maluSkaits = value;
    }

    // 4, metodi set, kas kas pieshkir veertiibasmainiigajiem a,b,c,d.
    public void setMalas(double mala1, double mala2, double mala3, double mala4) {
        a = mala1;
        b = mala2;
        c = mala3;
        d = mala4;        
    }
    
    public void setMalas(double mala1, double mala2, double mala3){
        a = mala1;
        b = mala2;
        c = mala3;
    }

    // 5, uztaisiit metodi,kas aprekina perimetru un ar return atgriezh veertiibublic
    public double getPerimetrs() {

        switch (maluSkaits) {
            case 3:
                return a + b + c;
            case 4:
                return a + b + c + d;
            default: 
                return 0;
        }

    }

    // >> obligaati jaabuut pozitiiviem skaitljiem - a,b,c un d ir optional
}
