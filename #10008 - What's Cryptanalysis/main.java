/* package whatever; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main {

    static String[] abecedario = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    static int[] respuesta;

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        respuesta = new int[abecedario.length];
        String cadena = "";
        for (int i = 0; i < n; i++) {
            cadena = br.readLine();
            String palabras[] = cadena.split(" ");
            for (int j = 0; j < palabras.length; j++) {
                String palabra = palabras[j];
                for (int k = 0; k < palabra.length(); k++) {
                    int pos = posicionLetra((palabra.charAt(k) + "").toLowerCase());
                    if (pos != -1) {
                        respuesta[pos]++;
                    }
                }
            }
        }
        imprimir();
    }

    public static void imprimir() {
        ordenar();
        for (int i = 0; i < respuesta.length; i++) {
            if (respuesta[i] != 0) {
                System.out.println(abecedario[i].toUpperCase() + " " + respuesta[i]);
            }
        }
    }

    public static void ordenar() {
        for (int i = 0; i < respuesta.length - 1; i++) {
            int t_n;
            String t_s;
            for (int j = i + 1; j < respuesta.length; j++) {
                if (respuesta[i] < respuesta[j]) {
                    t_n = respuesta[j];
                    respuesta[j] = respuesta[i];
                    respuesta[i] = t_n;
                    t_s = abecedario[j];
                    abecedario[j] = abecedario[i];
                    abecedario[i] = t_s;
                } else {
                    if (respuesta[i] == respuesta[j]) {
                        if (abecedario[i].compareTo(abecedario[j]) > 0) {
                            t_n = respuesta[j];
                            respuesta[j] = respuesta[i];
                            respuesta[i] = t_n;
                            t_s = abecedario[j];
                            abecedario[j] = abecedario[i];
                            abecedario[i] = t_s;
                        }
                    }
                }
            }
        }
    }

    public static int posicionLetra(String letra) {
        for (int i = 0; i < abecedario.length; i++) {
            if (abecedario[i].equals(letra)) {
                return i;
            }
        }
        return -1;
    }
}
