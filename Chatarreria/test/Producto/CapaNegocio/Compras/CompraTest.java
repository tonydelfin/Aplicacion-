/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Compras;

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
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getFecha method, of class Compra.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Compra instance = new Compra();
        String expResult = "18/05/2022";
        instance.setFecha(expResult);
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFecha method, of class Compra.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "18/05/2022";
        Compra instance = new Compra();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdCompra method, of class Compra.
     */
    @Test
    public void testGetIdCompra() {
        System.out.println("getIdCompra");
        Compra instance = new Compra();
        long expResult = 0;
        instance.setIdProducto(expResult);
        long result = instance.getIdCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdCompra method, of class Compra.
     */
    @Test
    public void testSetIdCompra() {
        System.out.println("setIdCompra");
        long idCompra = 0;
        Compra instance = new Compra();
        instance.setIdCompra(idCompra);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdCliente method, of class Compra.
     */
    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Compra instance = new Compra();
        long expResult = 0;
        instance.setIdCliente(expResult);
        long result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdCliente method, of class Compra.
     */
    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        long idCliente = 0;
        Compra instance = new Compra();
        instance.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getIdProducto method, of class Compra.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Compra instance = new Compra();
        long expResult = 0;
        instance.setIdProducto(expResult);
        long result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIdProducto method, of class Compra.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        long idProducto = 0;
        Compra instance = new Compra();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotal method, of class Compra.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Compra instance = new Compra();
        double expResult = 10.0;
        instance.setTotal(expResult);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTotal method, of class Compra.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double Total = 10.0;
        Compra instance = new Compra();
        instance.setTotal(Total);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getKilosC method, of class Compra.
     */
    @Test
    public void testGetKilosC() {
        System.out.println("getKilosC");
        Compra instance = new Compra();
        double expResult = 1.0;
        instance.setKilosC(expResult);
        double result = instance.getKilosC();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setKilosC method, of class Compra.
     */
    @Test
    public void testSetKilosC() {
        System.out.println("setKilosC");
        double KilosC = 1.0;
        Compra instance = new Compra();
        instance.setKilosC(KilosC);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
