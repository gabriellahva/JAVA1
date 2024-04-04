/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while1;

/**
 *
 * @author Aluno CA
 */
public class WHILE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Números ímpares de 1 a 100:");
        for (int imp = 1; imp <= 100; imp++) {
            if (imp % 2 != 0) {
                System.out.println(imp + " ");
            }
        }
    }
    
}
