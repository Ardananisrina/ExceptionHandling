/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author Nisrina Izdihar
 */
public class NegativenumberException extends Exception {
    private int bilangan;
    //default constructor
    NegativenumberException(){
    }
    NegativenumberException(String pesan){
        super(pesan);
    }
    NegativenumberException(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}

class DemoMembuatEksepsi3{
    public static int hitungFaktorial(int n)
            throws NegativenumberException{
        if(n < 0){
            throw new NegativenumberException("Bilangan tidak boleh negatif", n);
        }
        int hasil = 1;
        for (int i = n; i >= 1; i++){
            hasil *= i;
        }
        return hasil;
    }
    public static void main(String[] args){
        System.out.println("Pada saat menghitung 5!");
        try{
            System.out.println("Hasil : " + hitungFaktorial(5));
        }catch(NegativenumberException nne){
            System.out.println("Bilangan : " + nne.getBilangan());
        }
        System.out.println("\nPada saat menghitung -5!");
        try{
            System.out.println("Hasil : " + hitungFaktorial(-5));
        }catch(NegativenumberException nne){
            System.out.println("Bilangan : " + nne.getBilangan());
            nne.printStackTrace();
        }
    }
}
