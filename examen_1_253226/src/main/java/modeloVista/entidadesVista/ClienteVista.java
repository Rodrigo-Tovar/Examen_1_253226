/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista.entidadesVista;

/**
 *
 * @author rodri
 */
public class ClienteVista {
    
    private String nombre;
    private String direccion;
    private ReciboVista recibo;
    private TarjetaVista tarjeta;
    
    public ClienteVista(String nombre, String direccion, ReciboVista recibo, TarjetaVista tarjeta) {
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

    public ReciboVista getRecibo() {
        return recibo;
    }

    public void setRecibo(ReciboVista recibo) {
        this.recibo = recibo;
    }

    public TarjetaVista getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaVista tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "ClienteVista{" + "nombre=" + nombre + ", direccion=" + direccion + ", recibo=" + recibo + ", tarjeta=" + tarjeta + '}';
    }
    
    
    
}
