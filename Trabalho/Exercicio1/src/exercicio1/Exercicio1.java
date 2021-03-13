/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Declaração de Variáveis
        double a,b,c, media;
        int cont = 0;
        
        // Instancia da classe Scanner
        Scanner sc = new Scanner(System.in);
        
        // Entrada de Dados
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        // Processamento 1 - Média aritmética
        media = (a+b+c)/3;
        
        // Processamento 2 - Processamento lógico
        if(a > media && b < media && c < media || a < media && b > media && c < media || a < media && b < media && c > media) {
            cont = 1;
        } else if (a > media && b > media && c < media || a > media && b < media && c > media || a < media && b > media && c > media) {
            cont = 2;
        } else if (a > media && b > media && c > media) {
            cont = 3;
        } else {
            cont = 0;
        }
           
        // Saída de dados
        System.out.println(cont);
    }
    
}
    
