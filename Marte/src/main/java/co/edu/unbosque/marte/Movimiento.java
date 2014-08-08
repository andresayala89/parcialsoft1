/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

/**
 *
 * @author Andres
 */
public class Movimiento {
    
      String movimientos;
    int n;
    char mov[];

    public Movimiento(String movimientos) {

        if (movimientos.isEmpty()) {
            throw new IllegalArgumentException("No debe estar vacia la linea");
        }

        if (!movimientos.matches("[IAD]*")) {
            throw new IllegalArgumentException("Los datos ingresados no son correctos");
        }
        this.movimientos = movimientos;
        n=-1;
    }

    public char getNextMov() {
        mov=this.movimientos.toCharArray();
        n++;
        return mov[n];
        
    }
    
}
