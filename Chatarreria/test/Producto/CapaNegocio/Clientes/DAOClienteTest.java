/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Clientes;

import java.util.Iterator;
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
public class DAOClienteTest {
    
    public DAOClienteTest() {
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
     * Test of ageregarCliente method, of class DAOCliente.
     */
    @Test
    public void testAgeregarCliente() {
        System.out.println("ageregarCliente");
        Cliente c = null;
        DAOCliente instance = new DAOCliente();
        Integer expResult = null;
        Integer result = instance.ageregarCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of buscarClientePorId method, of class DAOCliente.
     */
    @Test
    public void testBuscarClientePorId() {
        System.out.println("buscarClientePorId");
        Integer idCliente = null;
        DAOCliente instance = new DAOCliente();
        Cliente expResult = null;
        Cliente result = instance.buscarClientePorId(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of consultarClientes method, of class DAOCliente.
     */
    @Test
    public void testConsultarClientes() {
        System.out.println("consultarClientes");
        DAOCliente instance = new DAOCliente();
        Iterator expResult = null;
        Iterator result = instance.consultarClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerClientePorId method, of class DAOCliente.
     */
    @Test
    public void testObtenerClientePorId() {
        System.out.println("obtenerClientePorId");
        Integer idCliente = null;
        DAOCliente instance = new DAOCliente();
        Cliente expResult = null;
        Cliente result = instance.obtenerClientePorId(idCliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerElSiguienteId method, of class DAOCliente.
     */
    @Test
    public void testObtenerElSiguienteId() {
        System.out.println("obtenerElSiguienteId");
        DAOCliente instance = new DAOCliente();
        Integer expResult = null;
        Integer result = instance.obtenerElSiguienteId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of eliminarPorId method, of class DAOCliente.
     */
    @Test
    public void testEliminarPorId() {
        System.out.println("eliminarPorId");
        Integer idEliminar = null;
        DAOCliente instance = new DAOCliente();
        Integer expResult = null;
        Integer result = instance.eliminarPorId(idEliminar);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of actualizarCliente method, of class DAOCliente.
     */
    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        Cliente c = null;
        DAOCliente instance = new DAOCliente();
        Integer expResult = null;
        Integer result = instance.actualizarCliente(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerClientes method, of class DAOCliente.
     */
    @Test
    public void testObtenerClientes() {
        System.out.println("obtenerClientes");
        DAOCliente instance = new DAOCliente();
        Iterator expResult = null;
        Iterator result = instance.obtenerClientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of obtenerClientesCompra method, of class DAOCliente.
     */
    @Test
    public void testObtenerClientesCompra() {
        System.out.println("obtenerClientesCompra");
        DAOCliente instance = new DAOCliente();
        Iterator expResult = null;
        Iterator result = instance.obtenerClientesCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
