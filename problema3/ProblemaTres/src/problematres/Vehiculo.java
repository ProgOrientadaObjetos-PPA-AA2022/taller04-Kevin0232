/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematres;

/**
 *
 * @author kevin
 */
public class Vehiculo {

    private String cedula;
    private String marca;
    private int fabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Vehiculo(String ced, String marc){
        cedula = ced;
        marca = marc;
        
    }
    
    public Vehiculo(String ced, String marc, int anio, double valor){
        cedula = ced;
        marca = marc;
        fabricacion = anio;
        valorVehiculo = valor;
    }
    
    public void establecerCedula(String c){
        cedula = c;
    }
    public void establecerMarca(String c){
        marca = c;
    }
    public void establecerFechaFabricacion(int c){
        fabricacion = c;
    }
    public void establecerValorVehiculo(double c){
        valorVehiculo = c;
    }
    public void calcularValorMatricula(){
        //se sacó el 0.2% ya que al sacar el 0.002% salian valores negativos
        valorMatricula = (valorVehiculo*0.002)-(2022-fabricacion);
    }
    
    public String obtenerCedula(){
        return cedula;
    }
    public String obtenerMarca(){
        return marca;
    }
    public int obtenerFechaFabricacion(){
        return fabricacion;
    }
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Cedula del Dueño: %s.\nMarca del Vehiculo:"
                + " %s.\nAño de Fabricación: %d.\nValor del Vehiculo: %.2f.\n"
                + "Valor de la Matricula: %.2f. ",obtenerCedula(),obtenerMarca()
                ,obtenerFechaFabricacion(),obtenerValorVehiculo(),obtenerValorMatricula());
        return cadena;
    }
    
}
