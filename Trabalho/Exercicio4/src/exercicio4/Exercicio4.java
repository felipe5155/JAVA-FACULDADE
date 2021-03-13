/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("Digite sua idade e altura");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        Float b = sc.nextFloat();
        int s = 0;
        
        if(a<12){
            System.out.println("Você tem que ser maior de 12 anos");
        }
        
        if(a>=12 && b>=1500){
         s++;   
        }if(a>=14 && b>=1400){
            s++;
        }if(a>=16 && b>=1700)
        s++;
        System.out.println(s);
    }
    
    
}
