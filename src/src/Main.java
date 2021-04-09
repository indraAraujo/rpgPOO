/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author indra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int poder;
        
        System.out.println("Qual o nome do seu personagem?");
        System.out.print("---> ");
        nome=input.nextLine();
        
         poder = (int)(Math.random()*((5-1)+1))+1;
         
        Protagonista protagonista = new Protagonista(nome, poder, 5, 2, 2,0);
        
        System.out.println("VOCÊ");
        System.out.println(protagonista);
        
    }
    
}
