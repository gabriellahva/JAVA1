/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while3;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class WHILE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int último = sc1.nextInt();
        
        System.out.println("Números pares de 1 até " + último + ":");
        for (int par = 2; par <= último; par += 2) {
            System.out.println(par + " ");
        }
        System.out.println("Números ímpares de 1 até " + último + ":");
        for (int imp = 1; imp <= último; imp += 2) {
            System.out.println(imp + " ");
        
        }
        
        
        
    }
    
}
