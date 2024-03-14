/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa5;

/**
 *
 * @author Aluno CA
 */
import java.util.Scanner;
public class Programa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o nome do vendedor: ");
        String nome = scanner.nextLine();
      
        System.out.print("Insira o salario fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Digite o total de vendas efetuadas pelo vendedor no mes: R$ ");
        double vendas = scanner.nextDouble();
        
        double comissao = vendas * 0.15;
        double salarioFinal = salarioFixo + comissao;
        

        System.out.println("\nNome do vendedor: " + nome);
        System.out.println("Salario fixo: R$" + salarioFixo);
        System.out.println("Salario no final do mes: R$" + salarioFinal);
        
        scanner.close();
    }
}