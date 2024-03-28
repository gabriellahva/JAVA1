/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Atividade1 {
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);
    
    int Numerodaclasse = sc1.nextInt();
    
    switch (Numerodaclasse){
        
        case 1 : System.out.println("Alimento não-perecível");
        break;
        
        case 2, 3, 4 : System.out.println("Alimento perecível");
        break;
        
        case 5, 6 : System.out.println("Vestuário");
        break;
        
        case 7: System.out.println("Higiene Pessoal");
        break;
        
        case 8, 9, 10, 11, 12, 13, 14, 15 : System.out.println("Limpeza e utensílios Domésticos");
        break;
        
        default :
                System.out.println("Código Inválido");
    }
    }
}
