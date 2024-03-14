/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa2;

/**
 *
 * @author Aluno CA
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 10;
        
        System.out.println("\nValores originais");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        int c = a;
        a = b;
        b = c;
        
        System.out.println("\nValores invertidos");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
    }
    
}
