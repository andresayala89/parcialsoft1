/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import java.io.File;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    @BeforeTest
    public void setTest() throws IOException{
       // File f=new File("E://software2/juego.txt");
       // f.createNewFile();
        //FileWriter fw=new FileWriter(f);
        //fw.append("7 8");
        //fw.append("\n0 0 N");
        //fw.append("\nAAIAADDIA");
        //fw.close();
    }
    
    @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ControladorArchivo c=new ControladorArchivo("E://software2/juego.txt");
        
    }
    @Test
    public void ObtieneElTamanioDelTablero() throws FileNotFoundException{
        ControladorArchivo c=new ControladorArchivo("E://software2/juego.txt");
        String linea=c.getPrimeraLinea();
        Assert.assertEquals(linea,"AAIAADDIA");
    }
}
