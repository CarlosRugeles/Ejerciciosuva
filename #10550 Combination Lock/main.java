/**
 *
 * @author rugeles
 */
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));

        while (sc.hasNext()) {

            int posicion_inicial = sc.nextInt();
            int numero_uno = sc.nextInt();
            int numero_dos = sc.nextInt();
            int numero_tres = sc.nextInt();

            if (posicion_inicial == 0 && numero_dos == 0 && numero_tres == 0 && numero_uno == 0) {
                break;
            }
            int respuesta = 1080;
            if (posicion_inicial < numero_uno) {
                respuesta += (40 + (posicion_inicial - numero_uno)) * 9;
            } else {
                respuesta += (posicion_inicial - numero_uno) * 9;
            }
            if (numero_uno > numero_dos) {
                respuesta += (40 + (numero_dos - numero_uno)) * 9;
            } else {
                respuesta += (numero_dos - numero_uno) * 9;
            }
            if (numero_dos < numero_tres) {
                respuesta += (40 + (numero_dos - numero_tres)) * 9;
            } else {
                respuesta += (numero_dos - numero_tres) * 9;
            }
            System.out.println(respuesta);
        }

        System.exit(0);
    }

}
