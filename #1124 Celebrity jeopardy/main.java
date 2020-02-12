/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author rugeles
 */
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        while (sc.hasNext()) {
            String entrada = sc.nextLine();
            System.out.println(entrada);
        }
        System.exit(0);
    }

}
