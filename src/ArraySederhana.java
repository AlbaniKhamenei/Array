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
public class ArraySederhana {
    public static void main (String [] args){
        // assigment
        // tipedata [] nama = {angka - angka}
    System.out.println("Assigment Array");
        
        // indeks = 0 1 2 3
        int[] arrayInteger = {1,2,3,4};
        
        arrayInteger[0] = 12;
        
        System.out.println(arrayInteger [0]);
        System.out.println(arrayInteger [1]);
        System.out.println(arrayInteger [2]);
        System.out.println(arrayInteger [3]);
        
        // deklarasi
        // tipedata 
        System.out.println("Deklarasi Array");
        float [] arrayFloat = new float[5];
        
        arrayFloat[3]= 11.5f;
        
         System.out.println(arrayFloat [0]);
         System.out.println(arrayFloat [1]);
         System.out.println(arrayFloat [2]);
         System.out.println(arrayFloat [3]);
         System.out.println(arrayFloat [4]);
         
         System.out.println(Arrays.toString(arrayInteger));
         System.out.println(Arrays.toString(arrayFloat));
    }
}
