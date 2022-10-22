/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Compras;

import Producto.BaseDatos.MysqlConector;
import Producto.CapaNegocio.Clientes.Cliente;
import Producto.CapaNegocio.Clientes.DAOCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jorge
 */
public class DAOCompras {
        private Vector miscompras;

    public DAOCompras(){
        
    }
    public Integer ageregarCompra(Compra c){
        Integer resultado = 0;
        MysqlConector mysql = new MysqlConector();
        String consulta =  "INSERT INTO compra(idCompra, fecha, idCliente, idproducto, KilosC, Total)" +
                "VALUES (0,'" + c.getFecha() + "','" + c.getIdCliente() + "','" + c.getIdProducto() + "','" 
                + c.getKilosC()+ "','"+ c.getTotal() + "')";
        resultado =mysql.ejecutarActualizacion(consulta);
        mysql.CerrarConexion(); 
        return resultado;
    }
   
       public Iterator consultarClientes(){
       this.miscompras = new Vector();
        MysqlConector mysql = new MysqlConector();
        String consulta = "SELECT * FROM compra";
        ResultSet registros = mysql.ejecutarConsulta(consulta);
        try {
            while(registros.next()){
                Compra c = new Compra();
                c.setIdCompra(registros.getInt("idCliente"));
                c.setFecha(registros.getString("fecha"));
                c.setIdCliente(registros.getInt("idCliente"));
                c.setIdProducto(registros.getInt("idproductos"));
                c.setKilosC(registros.getInt("KilosC"));
                c.setTotal(registros.getInt("Total"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.miscompras.iterator();
    }
    public Iterator obtenerCompras(){
        this.miscompras= new Vector();
        MysqlConector mysql = new MysqlConector();
        ResultSet rs = mysql.ejecutarConsulta("SELECT * FROM compra");
        try {
            while(rs.next()){
                Compra r = new Compra();
                r.setIdCompra(rs.getInt("idCliente"));
                r.setFecha(rs.getString("fecha"));
                r.setIdCliente(rs.getInt("idCliente"));
                r.setIdProducto(rs.getInt("idproducto"));
                r.setKilosC(rs.getInt("KilosC"));
                r.setTotal(rs.getInt("Total"));
                
                this.miscompras.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.miscompras.iterator();
    }
       
    
 
}
