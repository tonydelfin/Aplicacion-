/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Productos;

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
public class DAOProductos {
    private MysqlConector mysql;
    private Vector misproductos;
    
    public Integer agregarProducto(producto r){
        
        MysqlConector mysql = new MysqlConector();
        String consulta = "INSERT INTO productos (idproducto, descripcion, precio) VALUES "
                + "(" + r.obtenerIdproducto() + ", '" + r.obtenerDescripcion()+"','" + r.obtenerPrecio() + "')";
        Integer resultado = mysql.ejecutarActualizacion(consulta);
        mysql.CerrarConexion();
        return resultado;
    
        
    }
    public Iterator obtenerProducto(){
        this.misproductos= new Vector();
        MysqlConector mysql = new MysqlConector();
        ResultSet rs = mysql.ejecutarConsulta("SELECT * FROM productos");
        try {
            while(rs.next()){
                producto r = new producto();
                r.ponerIdproducto(rs.getInt("idproducto"));
                r.ponerDescripcion(rs.getString("descripcion"));
                r.ponerPrecio(rs.getDouble("precio"));
                
                this.misproductos.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return this.misproductos.iterator();
    }
    public Iterator consultarproductos(){
    this.misproductos = new Vector();
    mysql = new MysqlConector();
    ResultSet rs = mysql.ejecutarConsulta("SELECT * FROM productos");
    try {
        while(rs.next()){
            producto rf = new producto();
            rf.ponerIdproducto(rs.getInt("idproducto"));
            rf.ponerDescripcion(rs.getString("descripcion"));
            rf.ponerPrecio(rs.getDouble("precio"));

            this.misproductos.add(rf);
        }
    } catch (SQLException ex) {
        Logger.getLogger(DAOProductos.class.getName()).log(Level.SEVERE, null, ex);
    }
    mysql.CerrarConexion();
    return this.misproductos.iterator();
    }
    public Integer eliminarProductosID(Integer idEliminar){
        Integer res =0;
        mysql = new MysqlConector();
        res = mysql.ejecutarActualizacion("DELETE FROM productos WHERE idproducto=" + idEliminar);
        mysql.CerrarConexion();
        return res;
    }
    
    public Integer actualizacionProducto(producto r){
        Integer resultado = 0;
        MysqlConector mysql = new MysqlConector();
        
       String consulta = "UPDATE productos SET descripcion='" + r.obtenerDescripcion() + "', precio='" + r.obtenerPrecio()+ "' WHERE idproducto=" + r.obtenerIdproducto();
        resultado = mysql.ejecutarActualizacionP(consulta);
        mysql.CerrarConexion();
        return resultado;
    }
    public producto obtenerProductoID(Integer idproducto){
        producto r = null;
        MysqlConector mysql = new MysqlConector();
        String consulta = "SELECT * FROM productos WHERE idproducto =" + idproducto;
        ResultSet reg = mysql.ejecutarConsulta(consulta);
        try {
            while(reg.next()){
                r = new producto();
                r.ponerIdproducto(reg.getInt("idproducto"));
                r.ponerDescripcion(reg.getString("descripcion"));
                r.ponerPrecio(reg.getDouble("precio"));
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.CerrarConexion();
        return r;
    }
    
}
