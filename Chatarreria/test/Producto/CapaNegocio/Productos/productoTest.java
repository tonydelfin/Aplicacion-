/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Productos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jorge
 */
public class productoTest {
    
    public productoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ponerIdproducto method, of class producto.
     */
    @Test
    public void testPonerIdproducto() {
        System.out.println("ponerIdproducto");
        long nuevoproducto = 1;
        producto instance = new producto();
        instance.ponerIdproducto(nuevoproducto);

    }

    /**
     * Test of obtenerIdproducto method, of class producto.
     */
    @Test
    public void testObtenerIdproducto() {
        System.out.println("obtenerIdproducto");
        producto instance = new producto();
        long expResult = 1;
        instance.ponerIdproducto(expResult);
        long result = instance.obtenerIdproducto();
        assertEquals(expResult, result);

    }

    /**
     * Test of ponerDescripcion method, of class producto.
     */
    @Test
    public void testPonerDescripcion() {
        System.out.println("ponerDescripcion");
        String nuevaDescripcion = "Cobre";
        producto instance = new producto();
        instance.ponerDescripcion(nuevaDescripcion);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerDescripcion method, of class producto.
     */
    @Test
    public void testObtenerDescripcion() {
        System.out.println("obtenerDescripcion");
        producto instance = new producto();
        String expResult = "Cobre";
        instance.ponerDescripcion(expResult);
        String result = instance.obtenerDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of ponerPrecio method, of class producto.
     */
    @Test
    public void testPonerPrecio() {
        System.out.println("ponerPrecio");
        Double nuevoPrecio = 1.2;
        producto instance = new producto();
        instance.ponerPrecio(nuevoPrecio);

    }

    /**
     * Test of obtenerPrecio method, of class producto.
     */
    @Test
    public void testObtenerPrecio() {
        System.out.println("obtenerPrecio");
        producto instance = new producto();
        Double expResult = 1.2;
        instance.ponerPrecio(expResult);
        Double result = instance.obtenerPrecio();
        assertEquals(expResult, result);

    }
    
}
