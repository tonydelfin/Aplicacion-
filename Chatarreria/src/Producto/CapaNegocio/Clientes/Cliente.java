    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.CapaNegocio.Clientes;

/**
 *
 * @author Jorge
 */
public class Cliente {
    private long idCliente;
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String tel;
    private double kilosRobados;
   
    
    public Cliente(){
        this.idCliente = 0;
        this.kilosRobados = 0;
        this.nombre = this.apPaterno = this.apMaterno = this.tel =  null;
    }
    public void ponerIdCliente(long nuevoIdCliente){
        this.idCliente = nuevoIdCliente;
    }
    public long obtenerIdCliente(){
        return this.idCliente;
    }
    public void ponerNombreCliente(String NuevoNombre){
        this.nombre= NuevoNombre;
    }
    public String obtenerNombre(){
        return this.nombre;
    }
    public void ponerApPaterno(String NuevoApPaterno){
        this.apPaterno= NuevoApPaterno;
    }
    public String obtenerApPaterno(){
        return this.apPaterno;
    }
    public void ponerApMaterno(String NuevoApMaterno){
        this.apMaterno= NuevoApMaterno;
    }
    public String obtenerApMaterno(){
        return this.apMaterno;
    }
    public void ponerTelefono(String NuevoTel){
        this.tel= NuevoTel;
    }
    public String obtenerTelefono(){
        return this.tel;
    }
   
    
    public double getKilosRobados() {
        return kilosRobados;
    }

    public void setKilosRobados(double kilosRobados) {
        this.kilosRobados = kilosRobados;
    }
}
