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
public class UjiExceptionHandling extends Exception {
    private int bilangan;
        UjiExceptionHandling(){
    }
    UjiExceptionHandling(String pesan){
        super(pesan);
    }   
    UjiExceptionHandling(String pesan , int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
    
}
