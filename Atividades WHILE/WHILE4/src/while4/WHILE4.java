/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package while4;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class WHILE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos alunos tem na sala?");
        int numAlunos = scanner.nextInt();

        int contador = 1;
        double totalNotas = 0;

        while (contador <= numAlunos) {
            System.out.println("Digite a nota do aluno " + contador + ":");
            double nota = scanner.nextDouble();
            totalNotas += nota;
            contador++;
        }

        double mediaTurma = totalNotas / numAlunos;
        System.out.println("A média da turma é: " + mediaTurma);

        scanner.close();
    }
}
