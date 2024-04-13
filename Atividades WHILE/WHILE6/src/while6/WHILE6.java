/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while6;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class WHILE6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nmr = 1;
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;

        while (nmr <= 10) {
            System.out.println("Digite o número " + nmr + ":");
            int numero = scanner.nextInt();
            
            if (numero > maior1) {
                maior2 = maior1;
                maior1 = numero;
            } else if (numero > maior2) {
                maior2 = numero;
            }
            
            nmr++;
        }

        System.out.println("Os dois maiores números digitados são: " + maior1 + " e " + maior2);

        scanner.close();
    }
}