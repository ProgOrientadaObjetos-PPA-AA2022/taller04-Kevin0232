/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cheque;

/**
 *
 * @author kevin
 */
public class Cheque {

    private String cliente;
    private String banco;
    private double cheque;
    private double comision;
    
    public Cheque(String client, String banc){
        cliente = client;
        banco = banc;
    }
    
    public Cheque(String client, String banc,double cheq){
        cliente = client;
        banco = banc;
        cheque = cheq;
    }
    
    public void establecerCliente(String c){
        cliente = c;
    }
    public void establecerBanco(String c){
        banco = c;
    }
    public void establecerValorCheque(double c){
        cheque = c;
    }
    public void calcularValorComision(){
        comision = cheque*0.003;
    }
    public String obtenerCliente(){
        return cliente;
    }
    public String obtenerBanco(){
        return banco;
    }
    public double obtenerValorCheque(){
        return cheque;
    }
    public double obtenerValorComision(){
        return comision;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre del cliente: %s.\nNombre del Banco: %s.\n"
                + "Valor del cheque: %.2f.\nValor de la comisión: %.2f.\n",obtenerCliente(),
                obtenerBanco(),obtenerValorCheque(),obtenerValorComision());
        return cadena;
    }
    
}
