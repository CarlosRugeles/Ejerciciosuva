/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import java.util.Scanner;

/**
 *
 * @author rugeles
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        Scanner br = new Scanner(System.in);
        int x = 0;
        int conteo = 0;
        while (br.hasNext()) {
            String cadena = br.nextLine();
            x = 0;
            while (cadena.contains("\"")) {
                if (cadena.substring(x, x + 1).equals("\"")) {
                    String temporal;
                    if (x != 0) {
                        if (conteo == 0) {
                            temporal = cadena.substring(0, x) + "``" + cadena.substring(x + 1, cadena.length());
                            conteo++;
                        } else {
                            temporal = cadena.substring(0, x) + "\'\'" + cadena.substring(x + 1, cadena.length());
                            conteo = 0;
                        }
                    } else {
                        if (conteo == 0) {
                            temporal = "``" + cadena.substring(x + 1, cadena.length());
                            conteo++;
                        } else {
                            temporal = "\'\'" + cadena.substring(x + 1, cadena.length());
                            conteo = 0;
                        }                        
                    }
                    cadena = temporal;
                }
                x++;
            }
            System.out.println(cadena);
        }
        System.exit(0);
    }
    
}
