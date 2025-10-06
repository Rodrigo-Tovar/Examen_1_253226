/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocios.entidades;

import modeloVista.entidadesVista.*;

/**
 *
 * @author rodri
 */
public class Cliente {
    
    private String nombre;
    private String direccion;
    private Recibo recibo;
    private Tarjeta tarjeta;
    
    public Cliente(String nombre, String direccion, Recibo recibo, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.recibo = recibo;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    
    
}
