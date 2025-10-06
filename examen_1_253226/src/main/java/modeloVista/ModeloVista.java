/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista;

import java.util.ArrayList;
import java.util.List;
import Observer.Observer;
import Observer.ObserverPago;
import modeloNegocios.ModeloNegocios;
import modeloVista.entidadesVista.ClienteVista;

/**
 *
 * @author rodri
 */
public class ModeloVista {
    
    private List<ClienteVista> clientes;
    private List<ClienteVista> clientesFiltro;
    private ModeloNegocios mn;
    private List<Observer> observers = new ArrayList<>();
    private List<ObserverPago> observersPago = new ArrayList<>();
    

    public ModeloVista() {
        this.clientesFiltro = new ArrayList<>();
    }

    public void setMn(ModeloNegocios mn) {
        this.mn = mn;
    }

    public List<ClienteVista> getClientesFiltro() {
        return clientesFiltro;
    }
    
    public void buscadorClientes(String search){
        mn.buscadorClientes(search);
    }
    
    public void pagar(String numTarjeta) {
        mn.pagar(numTarjeta);
    }
    
    public void mostrarRecibo(double pago){
        notificarPago();
    }
    
    public void actualizarClientes(List<ClienteVista> clientesFiltro) {
        this.clientesFiltro = clientesFiltro;
        notificar();
    }
    
    public void precargaClientes (List<ClienteVista> clientes) {
        this.clientes = clientes;
    }

    public List<ClienteVista> getClientes() {
        return clientes;
    }

    public void setClientes(List<ClienteVista> clientes) {
        this.clientes = clientes;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
    
    //Metodo usado para agregar observadores en este caso la PRESENTACION se agrega como observador
    public void addObserver(Observer o) {
        observers.add(o);
    }
    
    //Metodo que notifica a los observadores (en este caso solamente la PRESENTACION). despues como la presentacion implementa metodos de observer, se ejecuta update() el cual repinta la pantalla despues de ser notificada.
    private void notificar() {
        for (Observer o : observers) {
            o.update();
        }
    }
    
    public List<ObserverPago> getObserversPago() {
        return observersPago;
    }

    public void setObserversPago(List<ObserverPago> observers) {
        this.observersPago = observers;
    }
    
    //Metodo usado para agregar observadores en este caso la PRESENTACION se agrega como observador
    public void addObserverPago(ObserverPago o) {
        observersPago.add(o);
    }
    
    //Metodo que notifica a los observadores (en este caso solamente la PRESENTACION). despues como la presentacion implementa metodos de observer, se ejecuta update() el cual repinta la pantalla despues de ser notificada.
    private void notificarPago() {
        for (ObserverPago o : observersPago) {
            o.updatePago();
        }
    }
}
