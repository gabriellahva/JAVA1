/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;
import java.util.Scanner;
/**
 *
 * @author Aluno CA
 */
public class Atividade2 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        float N1 = sc1.nextFloat();
        float N2 = sc1.nextFloat();
        
        float media = (N1+N2)/2;
        
        System.out.println(media);
        
        if  (media < 4) {
            System.out.println("Repovado");
            }
        else if (media > 4.1 && media < 7){
            System.out.println("Exame");
        }
        else if (media > 7.1 && media <= 10){
            System.out.println("Aprovado");
        }
        else {
            System.out.println("Digite notas válidas!");
        }
        
    }
}
