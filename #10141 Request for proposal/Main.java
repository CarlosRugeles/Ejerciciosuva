/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author rugeles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero_requerimientos, numero_propuestas, contador = 0, posmayor = 0;

        Scanner sc = new Scanner(System.in);
        String cosa = sc.nextLine();
        numero_requerimientos = Integer.parseInt(cosa.split(" ")[0]);
        numero_propuestas = Integer.parseInt(cosa.split(" ")[1]);
        posmayor = 0;

        while (numero_propuestas != 0 && numero_requerimientos != 0) {
            contador++;
            String[] propuestas = new String[numero_propuestas];
            double[][] valor = new double[numero_propuestas][2];
            for (int i = 0; i < numero_requerimientos; i++) {
                cosa = sc.nextLine();
            }
            for (int i = 0; i < numero_propuestas; i++) {
                propuestas[i] = sc.nextLine();
                cosa = sc.nextLine();
                valor[i][0] = Double.parseDouble(cosa.split(" ")[0]);
                valor[i][1] = Double.parseDouble(cosa.split(" ")[1]);
                for (int j = 0; j < valor[i][1]; j++) {
                    cosa = sc.nextLine();
                }
            }
            for (int i = 1; i < numero_propuestas; i++) {
                double comp1, comp2, valor1, valor2;
                comp1 = valor[posmayor][1] / numero_requerimientos;
                valor1 = valor[posmayor][0];
                comp2 = valor[i][1] / numero_requerimientos;
                valor2 = valor[i][0];

                if (comp2 > comp1) {
                    posmayor = i;
                } else {
                    if (comp2 == comp1) {
                        if (valor2 < valor1) {
                            posmayor = i;
                        }
                    }
                }
            }
            if (contador == 1) {
                System.out.println("RFP #" + contador + "\n" + propuestas[posmayor]);
            } else {
                System.out.println("\nRFP #" + contador + "\n" + propuestas[posmayor]);
            }
            cosa = sc.nextLine();
            numero_requerimientos = Integer.parseInt(cosa.split(" ")[0]);
            numero_propuestas = Integer.parseInt(cosa.split(" ")[1]);
            posmayor = 0;
        }
        System.exit(0);
    }

}
