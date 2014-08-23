/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.parcial;

import java.util.Scanner;

/**
 *
 * @author F211
 */
public class software1 {
    
       Scanner reader = new Scanner(System.in);
    int iNumero1;
    int iNumero2;

    public software1(int i, int i0) {
    iNumero1= i;
    iNumero2= i0;
    }

    public int getvalor1() {
       System.out.println("Dame el primer número");
   
    return iNumero1;
    }
        public int getvalor2() {
    System.out.println("Dame el segundo número");
   
    return iNumero2;
    }
    
    public boolean valoresiguales() {
     if (iNumero1==iNumero2 ) {
 
           return true; 
    }
               return false;
    }
        public int valormayor() {
     if (iNumero1>iNumero2 ){
 
           return iNumero1; 
    }
               return iNumero2;
    }
 
         
    }
    
   //      if (iNumero1> iNumero2 )
//    System.out.println(iNumero1 + " es el mayor.");
 //   else
 //   System.out.println(iNumero2 + " es el mayor."); 

}
