/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque;

import co.edu.unbosque.parcial.software2;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class testsoftware2 {

    @Test
    public void valor1() throws FileNotFoundException, IOException {
        software2 m = new software2(1, 2, 3);
        Assert.assertEquals(m.getvalor1(), 1);
    }

    @Test
    public void valor2() throws FileNotFoundException, IOException {

        software2 m = new software2(1, 2, 3);
        Assert.assertEquals(m.getvalor2(), 2);
    }

    @Test

    public void valor3() throws FileNotFoundException, IOException {

        software2 m = new software2(1, 2, 3);
        Assert.assertEquals(m.getvalor3(), 3);
    }

    @Test
    public void valorigual() throws FileNotFoundException, IOException {

        software2 m = new software2(1, 1, 1);
        Assert.assertEquals(m.valoresiguales(), true);
    }

    @Test
    public void valormayorA() throws FileNotFoundException, IOException {

        software2 m = new software2(4, 2, 2);
        Assert.assertEquals(m.valorAmayor(), true);
    }
        @Test
    public void valormayorB() throws FileNotFoundException, IOException {

        software2 m = new software2(1, 4, 3);
        Assert.assertEquals(m.valorBmayor(), true);
    }
        @Test
    public void valormayorC() throws FileNotFoundException, IOException {

        software2 m = new software2(1, 2, 3);
        Assert.assertEquals(m.valorCmayor(), true);
    }
}
