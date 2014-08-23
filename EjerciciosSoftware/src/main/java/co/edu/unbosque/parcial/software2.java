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
public class software2 {
    
       Scanner reader = new Scanner(System.in);
    int iNumero1;
    int iNumero2;
    int iNumero3;

    public software2(int i, int i0, int i1) {
    iNumero1= i;
    iNumero2= i0;
    iNumero3= i1;
    }
    
    public int getvalor1() {
       System.out.println("Dame el primer número");
   
    return iNumero1;
    }
        public int getvalor2() {
    System.out.println("Dame el segundo número");
   
    return iNumero2;
    }
                public int getvalor3() {
    System.out.println("Dame el tercer número");
   
    return iNumero3;
    }
    
        public boolean valorAmayor() {
     if (iNumero1>iNumero2 && iNumero1>iNumero3) {
 
           return true; 
    } 
               return false;
    }    
        
      public boolean valorBmayor() {
     if (iNumero2>iNumero1 && iNumero2>iNumero3) {
 
           return true; 
    } 
               return false;
    }  
                
     public boolean valorCmayor() {
     if (iNumero3>iNumero2 && iNumero3>iNumero1) {
 
           return true; 
    } 
               return false;
    }  
                        
                        
    public boolean valoresiguales() {
     if (iNumero1==iNumero2 && iNumero2==iNumero3 ) {
 
           return true; 
    }
               return false;
    }
        
         
    }
    
   //      if (iNumero1> iNumero2 )
//    System.out.println(iNumero1 + " es el mayor.");
 //   else
 //   System.out.println(iNumero2 + " es el mayor."); 

}
