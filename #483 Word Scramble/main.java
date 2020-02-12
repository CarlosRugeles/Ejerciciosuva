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
            String[] entrada = sc.nextLine().split(" ");
            String resultado = "";
            for (String palabra : entrada) {
                if (!resultado.equals("")) {
                    resultado += " ";
                }
                for (int j = palabra.length(); j >= 1; j--) {
                    resultado += palabra.substring(j - 1, j);
                }
            }
            System.out.println(resultado);
        }
        System.exit(0);
    }

}
