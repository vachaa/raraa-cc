/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo.pkg41822010079.pkg41822010082.latihan21;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
import java.util.Scanner;
public class PBO4182201007941822010082Latihan21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Format Tugas PBO");

        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Masukkan Banyaknya Mahasiswa: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai Mahasiswa Ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        System.out.println ("Maka, Rata-Rata Nilainya Adalah: "+rata);
       
   }
}

        
    


        
     
    


    
 // TODO code application logic here
    
    

