/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("n1 - ");
         double n1 = sc1.nextInt();
        System.out.println("n2 - ");
         double n2 = sc1.nextInt();
         
         double media = (n1+n2)/2;
         double diferenca = n1-n2;
         if (diferenca < 0){
             diferenca = diferenca * -1; 
         }
         
         double produto = n1*n2;
         double divisao = (n1/n2);
         System.out.println(divisao);
         
        System.out.println("Escolha dentre as opções abaixo: "
                + "\n 1 - Média "
                + "\n 2 - Diferença "
                + "\n 3 - Produto "
                + "\n 4 - Divisão \n");
        
        int opcao = sc1.nextInt();
        
        
        switch(opcao){
        
            case 1 : System.out.println("A Média dos dois números digitados é: " + media);
            break;
            case 2 : System.out.println("A Diferença dos dois números digitados é: " + diferenca);
            break;        
            case 3 : System.out.println("O Produto dos dois números digitados é: " + produto);
            break;        
            case 4 : System.out.println("A divisão do primeiro para o segundo é de : " + divisao);
            break;        
                    
        }
    }
}