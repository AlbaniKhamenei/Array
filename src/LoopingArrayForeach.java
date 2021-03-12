/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.Arrays;
public class LoopingArrayForeach {
    public static void main (String [] args){
        int [] arrayAngka ={21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        // looping standart
        System.out.println("Looping Standart");
        for (int i=0; i<10; i++){
            System.out.println("Indeks ke-" +i+ "adalah = " +arrayAngka[i]);
        }
        // looping dengan property array 
        System.out.println("Looping dengan properti length");
        for (int i=0; i<arrayAngka.length; i++){
             System.out.println("Indeks ke-" +i+ "adalah = " +arrayAngka[i]);
        }
        // looping untuk collectionarray
        System.out.println("Looping for each");
        for (int angka : arrayAngka){
            System.out.println("angka pada looping ini =" +angka);
        }
        
        {    
        }}}