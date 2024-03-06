/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix en £");
        int valor_lliuras = sc.nextInt();

        double tipus_de_canvi = 1.17d;
        System.out.println(valor_lliuras + " lliuras (£) actualment equivalen a" + (valor_lliuras * tipus_de_canvi) + " euros (€)");
    }

}
