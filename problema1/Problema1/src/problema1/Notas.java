/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    String nombreEstudiante;
    private double calMat1;
    private double calMat2;
    private double calMat3;
    private double prom;
    
    public Notas(String nombre){
        nombreEstudiante = nombre;
    }
    public Notas(String nom, double mat1, double mat2, double mat3){
        nombreEstudiante = nom;
        calMat1= mat1;
        calMat2 = mat2;
        calMat3 = mat3;
    }
    public void establecerNombre(String c){
        nombreEstudiante = c;
    }
    public void establecerCal1(double c){
        calMat1 = c;
    }
    public void establecerCal2(double c){
        calMat2 = c;
    }
    public void establecerCal3(double c){
        calMat3 = c;
    }
    public void establecerPromedio(){
        prom = (calMat1 + calMat2 + calMat3)/3;
    }
    public String obtenerNombre(){
        return nombreEstudiante;
    }
    public double obtenerCal1(){
        return calMat1;
    }
    public double obtenerCal2(){
        return calMat2;
    }
    public double obtenerCal3(){
        return calMat3;
    }
    public double obtenerProm(){
        return prom;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("\nNombre del estudiante: %s.\nCalificacion 1: %.2f.\n"
                + "Calificacion 2: %.2f.\nCalificacion 3: %.2f.\nPromedio Total: %.2f.",
                obtenerNombre(), obtenerCal1(),obtenerCal2(),obtenerCal3(),obtenerProm());
        return cadena;
    }
    
    
}
