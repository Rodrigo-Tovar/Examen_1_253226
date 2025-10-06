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
public class Tarjeta {
    
    String numTarjeta;
    
    public Tarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }
    
}
