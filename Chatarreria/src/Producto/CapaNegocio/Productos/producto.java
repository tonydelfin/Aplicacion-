/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Productos;

/**
 *
 * @author Jorge
 */
public class producto {
    private long idproducto;
    private String descripcion;
    private Double precio;

    
    public producto(){
        this.idproducto = 0;
        this.descripcion = "";
        this.precio = 0.0;

    }
    
    
    public void ponerIdproducto(long nuevoproducto){
        this.idproducto = nuevoproducto;
    }
    public long obtenerIdproducto(){
        return this.idproducto;
        
    }
    
    public void ponerDescripcion(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }
    public String obtenerDescripcion(){
        return this.descripcion;
        
    }
    
    public void ponerPrecio(Double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
    public Double obtenerPrecio(){
        return this.precio;
        
    }
    
}
