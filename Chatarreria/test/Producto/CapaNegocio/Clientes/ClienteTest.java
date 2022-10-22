/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Clientes;

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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of ponerIdCliente method, of class Cliente.
     */
    @Test
    public void testPonerIdCliente() {
        System.out.println("ponerIdCliente");
        long nuevoIdCliente = 1;
        Cliente instance = new Cliente();
        instance.ponerIdCliente(nuevoIdCliente);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of obtenerIdCliente method, of class Cliente.
     */
    @Test
    public void testObtenerIdCliente() {
        System.out.println("obtenerIdCliente");
        Cliente instance = new Cliente();
        long expResult = 1;
        instance.ponerIdCliente(expResult);
        long result = instance.obtenerIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of ponerNombreCliente method, of class Cliente.
     */
    @Test
    public void testPonerNombreCliente() {
        System.out.println("ponerNombreCliente");
        String NuevoNombre = "Jorge";
        Cliente instance = new Cliente();
        instance.ponerNombreCliente(NuevoNombre);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerNombre method, of class Cliente.
     */
    @Test
    public void testObtenerNombre() {
        System.out.println("obtenerNombre");
        Cliente instance = new Cliente();
        String expResult = "Jorge";
        instance.ponerNombreCliente(expResult);
        String result = instance.obtenerNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ponerApPaterno method, of class Cliente.
     */
    @Test
    public void testPonerApPaterno() {
        System.out.println("ponerApPaterno");
        String NuevoApPaterno = "Delfin";
        Cliente instance = new Cliente();
        instance.ponerApPaterno(NuevoApPaterno);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerApPaterno method, of class Cliente.
     */
    @Test
    public void testObtenerApPaterno() {
        System.out.println("obtenerApPaterno");
        Cliente instance = new Cliente();
        String expResult = "Delfin";
        instance.ponerApPaterno(expResult);
        String result = instance.obtenerApPaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ponerApMaterno method, of class Cliente.
     */
    @Test
    public void testPonerApMaterno() {
        System.out.println("ponerApMaterno");
        String NuevoApMaterno = "Santos";
        Cliente instance = new Cliente();
        instance.ponerApMaterno(NuevoApMaterno);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerApMaterno method, of class Cliente.
     */
    @Test
    public void testObtenerApMaterno() {
        System.out.println("obtenerApMaterno");
        Cliente instance = new Cliente();
        String expResult = "Santos";
        instance.ponerApMaterno(expResult);
        String result = instance.obtenerApMaterno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ponerTelefono method, of class Cliente.
     */
    @Test
    public void testPonerTelefono() {
        System.out.println("ponerTelefono");
        String NuevoTel = "4981210770";
        Cliente instance = new Cliente();
        instance.ponerTelefono(NuevoTel);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerTelefono method, of class Cliente.
     */
    @Test
    public void testObtenerTelefono() {
        System.out.println("obtenerTelefono");
        Cliente instance = new Cliente();
        String expResult = "4981210770";
        instance.ponerTelefono(expResult);
        String result = instance.obtenerTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getKilosRobados method, of class Cliente.
     */
    @Test
    public void testGetKilosRobados() {
        System.out.println("getKilosRobados");
        Cliente instance = new Cliente();
        double expResult = 1.0;
        instance.setKilosRobados(expResult);
        double result = instance.getKilosRobados();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setKilosRobados method, of class Cliente.
     */
    @Test
    public void testSetKilosRobados() {
        System.out.println("setKilosRobados");
        double kilosRobados = 1.0;
        Cliente instance = new Cliente();
        instance.setKilosRobados(kilosRobados);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
