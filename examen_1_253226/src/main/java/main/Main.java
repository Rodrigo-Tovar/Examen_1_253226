/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controlador.Controlador;
import controlador.ControladorVista;
import modeloNegocios.ModeloNegocios;
import modeloVista.ModeloVista;
import vista.PantallaPagoLuz;

/**
 *
 * @author rodri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModeloVista modeloVista = new ModeloVista();
        ControladorVista controlVista = new ControladorVista(modeloVista);
        
        ModeloNegocios modeloNegocios = new ModeloNegocios(controlVista);
        modeloVista.setMn(modeloNegocios);
        
        Controlador controlador = new Controlador(modeloVista);
        
        PantallaPagoLuz pantalla = new PantallaPagoLuz(modeloVista, controlador);
        pantalla.setVisible(true);
        
        modeloNegocios.precargaClientes();
    }
    
}
