/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rugeles
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        while ((t = sc.nextInt()) != 0) {
            int[] arreglo = new int[t];
            int i = 0;
            int mayor = 0, suma = 0;
            while (t-- != 0) {
                arreglo[i] = sc.nextInt();
                suma += arreglo[i++];
                if (suma < 0) {
                    suma = 0;
                }
                if (suma > mayor) {
                    mayor = suma;
                }
            }

            if (mayor > 0) {
                System.out.println("The maximum winning streak is " + mayor + ".");
            } else {
                System.out.println("Losing streak.");
            }
        }
    }

}
