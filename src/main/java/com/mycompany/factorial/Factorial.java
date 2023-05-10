/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author emmanuel
 */
public class Factorial {
   public void fact() {
        Scanner stdIn = new Scanner(System.in);
        int numero;
        double factorial = 1.0;
        System.out.print("Introduzca un número entero: ");
        numero = stdIn.nextInt();
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println(numero + "! = " + factorial);
    }

    public static void main(String[] args) {
        Factorial Factil = new Factorial();
        Factil.fact();
    }
}
