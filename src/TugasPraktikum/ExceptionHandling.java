/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;
/**
 *
 * @author Nisrina Izdihar
 */
import java.util.Scanner;
public class ExceptionHandling {
    public static double Akar(double a, double b, double c) throws UjiExceptionHandling{
        double D = 0;
        if(D < 0){
            throw new UjiExceptionHandling("D < 0, Akar-akarnya Bil.Imajiner, Di Rubah ke Bil.Komplek\n");
        }
        double x1 = (-b+Math.sqrt(D))/2*a;
        double x2 = (-b-Math.sqrt(D))/2*a;
        System.out.printf("\tPersamaan Kuadrat : %.0fX + (%.0f)X2 + (%.1f)", a, b, c);
        System.out.printf("\n\tAkar-akar persamaannya : \n\tX1 = %.1f V X2 = %.1f", a, x1, x2);
        return 0;
    }
    public static void main(String[] args){
        Scanner baca = new Scanner(System.in);
        double a, b, c;
        System.out.printf("\tInput Nilai a = ");
        a = baca.nextDouble();
        System.out.printf("\tInput Nilai b = ");
        b = baca.nextDouble();
        System.out.printf("\tInput Nilai c = ");
        c = baca.nextDouble();
        double D = 0;
        D = b * b - 4 * a * c;
        
        try{
            System.out.printf("\t" + Akar(a, b, c));
        }catch(UjiExceptionHandling ine){
            double e;
            e = Math.abs(D);
            System.out.printf("\tPersamaan Kuadrat : %.0fX + (%.0f)X2 + (%.1f)\n", a, b, c);
            System.out.printf("\n\tAkar-akar Persamaannya(Bil.komplek) :\n\n\t\tX1 = " + (-b) + " + "
            + (Math.sqrt(e)/2) * a + "j V X2 = " + (-b) + " - " + (Math.sqrt(e)/2) * a + "j");
            System.out.println("\n\t-----------------------------------------------------\n");
            ine.printStackTrace();
        }
    }
    
}