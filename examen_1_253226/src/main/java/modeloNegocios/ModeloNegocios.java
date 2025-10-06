/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloNegocios;

import controlador.ControladorVista;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modeloNegocios.entidades.Cliente;
import modeloNegocios.entidades.Recibo;
import modeloNegocios.entidades.Tarjeta;

/**
 *
 * @author rodri
 */
public class ModeloNegocios {

    private List<Cliente> clientes;
    private ControladorVista cv;

    public ModeloNegocios(ControladorVista cv) {
        this.cv = cv;
        this.clientes = setClientes();

    }

    public void buscadorClientes(String search) {
        List<Cliente> filtro = new ArrayList<>();

        // Construye el patrón regex
        Pattern pattern = Pattern.compile("^" + search);

        for (Cliente c : clientes) {
            if (c.getRecibo() != null) {
                String numRecibo = c.getRecibo().getNumRecibo();
                Matcher matcher = pattern.matcher(numRecibo);

                if (matcher.find()) {
                    filtro.add(c);
                }
            }
        }
        cv.actualizarClientes(filtro);
    }

    public List<Cliente> setClientes() {
        List<Cliente> clientes = new ArrayList<>();

        Recibo recibo1 = new Recibo("0123456789", 500);
        Tarjeta tarjeta1 = new Tarjeta("12345");
        Cliente cliente1 = new Cliente("Rodri", "Por ahi", recibo1, tarjeta1);
        clientes.add(cliente1);

        Recibo recibo2 = new Recibo("0987654123", 300);
        Tarjeta tarjeta2 = new Tarjeta("67890");
        Cliente cliente2 = new Cliente("Azael", "Monterei", recibo2, tarjeta2);
        clientes.add(cliente2);

        return clientes;
    }
    
    public void pagar(String numTarjeta){
        for (Cliente cliente : clientes) {
            if(cliente.getTarjeta().getNumTarjeta().equals(numTarjeta)){
                double pago = cliente.getRecibo().getAdeudo();
                cliente.getRecibo().setAdeudo(0);
                cv.pagoRealizado(pago);
                precargaClientes();
            }
        }
    }
    
    public void precargaClientes(){
        cv.precargaClientes(clientes);
    }
}
