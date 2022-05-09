/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problematres;

/**
 *
 * @author kevin
 */
public class Ejecutor {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("1128549524","Toyota");
        Vehiculo v2 = new Vehiculo("1104693495","Kia",2003,26000.58);
        
        v.establecerFechaFabricacion(2005);
        v.establecerValorVehiculo(21000.21);
        v.calcularValorMatricula();
        v2.calcularValorMatricula();
        
        System.out.printf("%s\n",v);
        System.out.println("----------------------------");
        System.out.printf("%s\n",v2);
    }
}
