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
        double tipus_de_canvi = 0;

        System.out.println("[1 = LIBRA A EURO] ");
        System.out.println("[2 = EURO A LIBRA] ");
        String decision = sc.nextLine();

        switch (decision) {
            case "1":
                System.out.println("Introdueix en £");
                int valor_lliuras = sc.nextInt();

                tipus_de_canvi = 1.17d;
                System.out.println(valor_lliuras + " lliuras (£) actualment equivalen a"
                        + (valor_lliuras * tipus_de_canvi) + " euros (€)");
                break;
            case "2":
                System.out.println("Introdueix en €");
                int valor_euros = sc.nextInt();

                tipus_de_canvi = 1.15d;
                System.out.println(valor_euros + " euros (€) actualment equivalen a"
                        + (valor_euros * tipus_de_canvi) + " lliuras (£)");
                break;
                default:
                System.out.println("Escribe una opcion valida.");
        }

    }

}
