/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modeloNegocios.entidades.Cliente;
import modeloVista.ModeloVista;
import modeloVista.entidadesVista.ClienteVista;
import modeloVista.entidadesVista.ReciboVista;
import modeloVista.entidadesVista.TarjetaVista;

/**
 *
 * @author rodri
 */
public class ControladorVista {
    
    private ModeloVista mv;

    public ControladorVista(ModeloVista mv) {
        this.mv = mv;
    }
    
    public void actualizarClientes (List<Cliente> clientes){
        List<ClienteVista> clientesVista = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ReciboVista reciboV = new ReciboVista(cliente.getRecibo().getNumRecibo(), cliente.getRecibo().getAdeudo());
            TarjetaVista tarjetaV = new TarjetaVista(cliente.getTarjeta().getNumTarjeta());
            ClienteVista clienteV = new ClienteVista(cliente.getNombre(), cliente.getDireccion(), reciboV, tarjetaV);
            clientesVista.add(clienteV);
        }
        mv.actualizarClientes(clientesVista);
    }
    
    public void precargaClientes (List<Cliente> clientes){
        List<ClienteVista> clientesVista = new ArrayList<>();
        for (Cliente cliente : clientes) {
            ReciboVista reciboV = new ReciboVista(cliente.getRecibo().getNumRecibo(), cliente.getRecibo().getAdeudo());
            TarjetaVista tarjetaV = new TarjetaVista(cliente.getTarjeta().getNumTarjeta());
            ClienteVista clienteV = new ClienteVista(cliente.getNombre(), cliente.getDireccion(), reciboV, tarjetaV);
            clientesVista.add(clienteV);
        }
        mv.precargaClientes(clientesVista);
    }
    
    public void pagoRealizado(double pago){
        mv.mostrarRecibo(pago);
    }
}
