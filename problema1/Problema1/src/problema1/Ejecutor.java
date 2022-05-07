/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        // TODO code application logic here
        String nom = "Juan";
        Notas n1 = new Notas(nom);
        nom = "Pedro";
        Notas n2 = new Notas( nom ,9.8, 8.5, 6.4);
        n1.establecerCal1(5.2);
        n1.establecerCal2(7.1);
        n1.establecerCal3(9.3);
        n1.establecerPromedio();
        n2.establecerPromedio();
        
        System.out.printf("%s\n",n1);
        System.out.println("----------------");
        System.out.printf("%s\n",n2);
    }
}
