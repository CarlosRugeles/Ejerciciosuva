/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rugeles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();
        int hora = Integer.parseInt(entrada.split(":")[0]);
        float minutos = Float.parseFloat(entrada.split(":")[1]);
        while (hora != 0 || minutos != 0) {
            float grados = 0;
            grados = Math.abs(((11 * minutos / 2)) - (30 * hora));
            if (grados > 180) {
                grados = 360 - grados;
            }
            System.out.println(grados + "00");
            entrada = br.readLine();
            hora = Integer.parseInt(entrada.split(":")[0]);
            minutos = Integer.parseInt(entrada.split(":")[1]);
        }
        System.exit(0);
    }

}
