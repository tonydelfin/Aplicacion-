/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.BaseDatos;

import java.sql.ResultSet;
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
public class MysqlConectorTest {
    
    public MysqlConectorTest() {
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
     * Test of ejecutarConsulta method, of class MysqlConector.
     */
    @Test
    public void testEjecutarConsulta() {
        System.out.println("ejecutarConsulta");
        String consulta = "";
        MysqlConector instance = new MysqlConector();
        ResultSet expResult = null;
        ResultSet result = instance.ejecutarConsulta(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ejecutarActualizacion method, of class MysqlConector.
     */
    @Test
    public void testEjecutarActualizacion() {
        System.out.println("ejecutarActualizacion");
        String consulta = "";
        MysqlConector instance = new MysqlConector();
        int expResult = 0;
        int result = instance.ejecutarActualizacion(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of ejecutarActualizacionP method, of class MysqlConector.
     */
    @Test
    public void testEjecutarActualizacionP() {
        System.out.println("ejecutarActualizacionP");
        String consulta = "";
        MysqlConector instance = new MysqlConector();
        int expResult = 0;
        int result = instance.ejecutarActualizacionP(consulta);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CerrarConexion method, of class MysqlConector.
     */
    @Test
    public void testCerrarConexion() {
        System.out.println("CerrarConexion");
        MysqlConector instance = new MysqlConector();
        instance.CerrarConexion();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
