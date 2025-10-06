/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloVista.entidadesVista;

/**
 *
 * @author rodri
 */
public class ReciboVista {
    
    String numRecibo;
    double adeudo;

    public ReciboVista(String numRecibo, double adeudo) {
        this.numRecibo = numRecibo;
        this.adeudo = adeudo;
    }

    public String getNumRecibo() {
        return numRecibo;
    }

    public void setNumRecibo(String numRecibo) {
        this.numRecibo = numRecibo;
    }

    public double getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(double adeudo) {
        this.adeudo = adeudo;
    }
    
    
    
}
