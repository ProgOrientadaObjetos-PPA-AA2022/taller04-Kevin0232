/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemados;

/**
 *
 * @author kevin
 */
public class Profes {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;
    public Profes(String nom, String ape, String ced){
        nombre = nom;
        apellido = ape;
        cedula = ced;
    }
    public Profes(String nom, String ape, String ced,double sB ){
        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldoBasico = sB;
    }
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerApellido(String c){
        apellido =c;
    }
    public void establecerCedula(String c){
        cedula = c;
    }
    public void establecerSueldoBasico(double c){
        sueldoBasico = c;
    }
    public void calcularSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.2);
    }
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellidos(){
        return apellido;
    }
    public String obtenerCedula(){
        return cedula;
    }
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    @Override
    public String toString(){
        String cadena = String.format("Nombre: %s.\nApellido: %s.\nCédula: %s.\n"
                + "Sueldo Basico: %.2f.\nSueldoFinal: %.2f.\n",obtenerNombre(),
                obtenerApellidos(),obtenerCedula(),obtenerSueldoBasico(),obtenerSueldoTotal());
        return cadena;
    }
}
