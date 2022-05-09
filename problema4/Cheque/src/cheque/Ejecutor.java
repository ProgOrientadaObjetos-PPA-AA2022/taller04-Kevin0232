/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cheque;

/**
 *
 * @author kevin
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        Cheque c = new Cheque("Juan Galarza", "Banco de Loja");
        Cheque c2 = new Cheque("Pedro Palacios", "Banco del Pacífico",260.58);
        
        c.establecerValorCheque(420.25);
        c.calcularValorComision();
        c2.calcularValorComision();
        
        System.out.printf("%s\n",c);
        System.out.println("-----------------------------");
        System.out.printf("%s\n",c2);
    }
}
