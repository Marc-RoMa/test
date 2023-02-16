/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m5_practica2_calculadora;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class M5_Practica2_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double res = 0;
        String operacion;

        do {

            double n1 = Metodos.introduceNumeros();

            operacion = Metodos.introduceOperacion();

            double n2 = Metodos.introduceNumeros();

            res = Metodos.calculos(n1, n2, operacion);

            System.out.println("(" + n1 + ") " + operacion + " (" + n2 + ")" + " = " + res);

            operacion = Metodos.continuarPrograma();
        } while (operacion.equals("s") || operacion.equals("S"));

    }
}
