/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite seu salario:");
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double s;
        
        if(a<1000){
            s = 1.3 * a;
            System.out.println(s);
        }else if(a>1000 && a<2000){
            s = 1.1*a;
            System.out.println(s);
        }else{
        
            System.out.println(a);
             
        
     }
    }
}
