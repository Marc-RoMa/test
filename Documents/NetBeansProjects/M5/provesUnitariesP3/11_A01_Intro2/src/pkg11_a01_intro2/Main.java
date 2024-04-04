/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_a01_intro2;

import java.util.Scanner;

/**
 *
 * @author phoen
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // EX1
        String nom = "Marc";
        String Cognom1 = "Rodriguez";
        String Cognom2 = "Martinez";
        
        
        // EX2
        Scanner terminal = new Scanner(System.in); 
        
        String inicio = "Mostrant preferencies";
        String pelicula;
        String serie; 
        
        System.out.println("cual es tu pelicula preferida?");
        pelicula = terminal.nextLine();
        
        System.out.println("cual es tu serie preferida?");
        serie = terminal.nextLine();  
        
        System.out.println(inicio + " de " + nom + " " + Cognom1 + " " 
                + Cognom2 + " "
                + " Tu pelicula preferida es " + pelicula 
                + " Tu serie preferida es " + serie + ".");
        
    }
    
}
