/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Compras;

import java.util.Date;

/**
 *
 * @author Jorge
 */
public class Compra {
    private String fecha;
    private long idCompra;
    private double Total;
    private long idCliente;
    private long idProducto;
    private double KilosC;
    
    public Compra(){

        this.fecha = null;
        this.idCliente = 0;
        this.idCompra = 0;
        this.idProducto = 0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(long idCompra) {
        this.idCompra = idCompra;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public double getKilosC() {
        return KilosC;
    }

    public void setKilosC(double KilosC) {
        this.KilosC = KilosC;
    }

}
