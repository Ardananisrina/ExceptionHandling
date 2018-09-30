/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import java.io.*;
/**
 *
 * @author Nisrina Izdihar
 */
public class DemoInputNumerik {
    public static void main(String[] args) throws IOException{
        System.out.print("Masukkan sebuah bilangan bulat: ");
        String temp;
        int bilangan = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //input data dianggap sebagai string
        temp = br.readLine();
        
        try{
            //konversi dari string ke integer
            bilangan = Integer.parseInt(temp);
        }catch(NumberFormatException nfe){
            System.out.println("Data yang dimasukkan bukan  bilangan bulat");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan " + "adalah " + bilangan);
    }
    
}
