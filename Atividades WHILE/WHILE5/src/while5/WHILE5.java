/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while5;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class WHILE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nmr = 1;
        int maior = Integer.MIN_VALUE;

        while (nmr <= 10) {
            System.out.println("Digite o número " + nmr + ":");
            int numero = scanner.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            nmr++;
        }

        System.out.println("O maior número digitado é: " + maior);

        scanner.close();
    }
}
