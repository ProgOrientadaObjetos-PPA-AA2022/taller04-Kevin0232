/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problemados;

/**
 *
 * @author kevin
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        Profes p = new Profes("Freddy","León","1150758495");        
        Profes p2 = new Profes("Ana","Churo","1185728594",360.8);
        p.establecerSueldoBasico(390.7);
        p.calcularSueldoTotal();
        p2.calcularSueldoTotal();
        
        System.out.printf("%s\n",p);
        System.out.println("------------------");
        System.out.printf("%s\n",p2);
        
        
        
        
    }
}
