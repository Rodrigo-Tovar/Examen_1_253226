/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modeloVista.ModeloVista;

/**
 *
 * @author rodri
 */
public class Controlador {
    
    ModeloVista mv;
    
    public Controlador(ModeloVista mv) {
        this.mv = mv;
    }
    
    public void buscadorClientes(String search){
        mv.buscadorClientes(search);
    }
    
    public void pagar(String numTarjeta){
        mv.pagar(numTarjeta);
    }
    
}
