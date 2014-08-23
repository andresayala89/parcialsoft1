package co.edu.unbosque;

import co.edu.unbosque.parcial.software1;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class testejercicio1 {

    @Test
    public void valor1() throws FileNotFoundException, IOException {
        software1 m = new software1(0, 1);
        Assert.assertEquals(m.getvalor1(), 0);
    }

    @Test
    public void valor2() throws FileNotFoundException, IOException {

        software1 m = new software1(1, 1);
        Assert.assertEquals(m.getvalor2(), 1);
    }

    @Test
    public void valorigual() throws FileNotFoundException, IOException {

        software1 m = new software1(1, 1);
        Assert.assertEquals(m.valoresiguales(), true);
    }

    @Test
    public void valormayor() throws FileNotFoundException, IOException {

        software1 m = new software1(2, 1);
        Assert.assertEquals(m.valormayor(), 2);
    }
}
