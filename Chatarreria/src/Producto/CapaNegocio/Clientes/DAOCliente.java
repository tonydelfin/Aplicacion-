/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Clientes;

import Producto.BaseDatos.MysqlConector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class DAOCliente {
    private Vector misclientes;

    public DAOCliente(){
        
    }
    public Integer ageregarCliente(Cliente c){
        Integer resultado = 0;
        MysqlConector mysql = new MysqlConector();
        String consulta =  "INSERT INTO clientes (idCliente, nombre, apPaterno, apMaterno, tel, KilosRobados)" + 
                "VALUES (0,'" + c.obtenerNombre() + "','" + c.obtenerApPaterno() + "','" + c.obtenerApMaterno() + "','" 
                + c.obtenerTelefono()+ "','"+ c.getKilosRobados() + "')";
        resultado =mysql.ejecutarActualizacion(consulta);
        mysql.CerrarConexion(); 
        return resultado;
    }
    
    public Cliente buscarClientePorId(Integer idCliente){
        Cliente c = null;
        MysqlConector mysql = new MysqlConector();
        String consulta = "SELECT * FROM clientes WHERE idCliente=" + idCliente;
        ResultSet registros = mysql.ejecutarConsulta(consulta);
        try {
            while(registros.next()){
                c = new Cliente();
                c.ponerIdCliente(registros.getInt("idCliente"));
                c.ponerNombreCliente(registros.getString("nombre"));
                c.ponerApPaterno(registros.getString("apPaterno"));
                c.ponerApMaterno(registros.getString("apMaterno"));
                c.ponerTelefono(registros.getString("tel"));
                c.setKilosRobados(registros.getDouble("KilosRobados"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return c;
    }
       public Iterator consultarClientes(){
       this.misclientes = new Vector();
        MysqlConector mysql = new MysqlConector();
        String consulta = "SELECT * FROM clientes";
        ResultSet registros = mysql.ejecutarConsulta(consulta);
        try {
            while(registros.next()){
                Cliente c = new Cliente();
                c = new Cliente();
                c.ponerIdCliente(registros.getInt("idCliente"));
                c.ponerNombreCliente(registros.getString("nombre"));
                c.ponerApPaterno(registros.getString("apPaterno"));
                c.ponerApMaterno(registros.getString("apMaterno"));
                c.ponerTelefono(registros.getString("tel"));
                c.setKilosRobados(registros.getDouble("KilosRobados"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.misclientes.iterator();
    }
    public Cliente obtenerClientePorId(Integer idCliente){
        Cliente miCliente = null;
        MysqlConector mysql = new MysqlConector();
        ResultSet rs = mysql.ejecutarConsulta("SELECT * FROM clientes WHERE idCliente=" + idCliente);
        try {
            while(rs.next()){
                miCliente = new Cliente();
                miCliente.ponerIdCliente(rs.getInt("idCliente"));
                miCliente.ponerNombreCliente(rs.getString("nombre"));
                miCliente.ponerApPaterno(rs.getString("apPaterno"));
                miCliente.ponerApMaterno(rs.getString("apMaterno"));
                miCliente.ponerTelefono(rs.getString("tel"));
                miCliente.setKilosRobados(rs.getDouble("KilosRobados"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return miCliente;
    }
    
    public Integer obtenerElSiguienteId(){
        Integer siguienteId = 0;
        MysqlConector mysql = new MysqlConector();
        ResultSet rs = mysql.ejecutarConsulta("SELECT MAX(idCliente) FROM clientes");
        try {
            while(rs.next()){
                siguienteId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return ++siguienteId;
    }
    
    public Integer eliminarPorId(Integer idEliminar){
        Integer resultado = 0;
        MysqlConector mysql = new MysqlConector();
        resultado = mysql.ejecutarActualizacion("DELETE FROM clientes WHERE idCliente=" + idEliminar);
        mysql.CerrarConexion();
        return resultado;
    }
    
    public Integer actualizarCliente(Cliente c){
        Integer resultado = 0;
        MysqlConector mysql = new MysqlConector();
        String consulta = "UPDATE clientes SET nombre='" + c.obtenerNombre() + "', apPaterno='" + c.obtenerApPaterno()
                + "', apMaterno='" + c.obtenerApMaterno() + "', tel='" + c.obtenerTelefono()+ "', KilosRobados='" + c.getKilosRobados() + "' WHERE idCliente=" + c.obtenerIdCliente();
        resultado = mysql.ejecutarActualizacion(consulta);
        mysql.CerrarConexion();
        return resultado;
    }
    
        
    public Iterator obtenerClientes(){
        this.misclientes = new Vector();
        MysqlConector mysql = new MysqlConector();
        ResultSet rs= mysql.ejecutarConsulta("SELECT *  FROM clientes");
        try {
            while(rs.next()){
                Cliente c =  new Cliente();
                c.ponerIdCliente(rs.getInt("idCliente"));
                c.ponerNombreCliente(rs.getString("nombre"));
                c.ponerApPaterno(rs.getString("apPaterno"));
                c.ponerApMaterno(rs.getString("apMaterno"));
                c.ponerTelefono(rs.getString("tel"));
                c.setKilosRobados(rs.getDouble("KilosRobados"));
                this.misclientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.misclientes.iterator();
    }
        public Iterator obtenerClientesCompra(){
        this.misclientes = new Vector();
        MysqlConector mysql = new MysqlConector();
        ResultSet rs= mysql.ejecutarConsulta("SELECT *  FROM clientes");
        try {
            while(rs.next()){
                Cliente c =  new Cliente();
                c.ponerIdCliente(rs.getInt("idCliente"));
                c.ponerNombreCliente(rs.getString("nombre"));
                c.setKilosRobados(rs.getDouble("KilosRobados"));
                this.misclientes.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.misclientes.iterator();
    }
 
}
  