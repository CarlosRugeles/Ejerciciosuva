package ClasePrincipal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        while (sc.hasNext()) {
            String[] entrada = sc.nextLine().split(" ");
            int[] numeros = new int[entrada.length];
            int[] resultados = new int[numeros.length - 1];
            for (int i = 0; i < entrada.length; i++) {
                numeros[i] = Integer.parseInt(entrada[i]);
                if (i != 0) {
                    resultados[i - 1] = Math.abs(numeros[i - 1] - numeros[i]);
                }
            }
            boolean bandera = true;
            int primero = resultados[0];
            for (int i = 1; i < resultados.length; i++) {
                if (!(resultados[i] <= primero && resultados[i - 1] >= resultados[i])) {
                    bandera = false;
                    break;
                }
            }
            if (bandera) {
                System.out.println("Jolly");
            } else {
                System.out.println("Not jolly");
            }
        }
    }

}
