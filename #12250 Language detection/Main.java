/**
 *
 * @author rugeles
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> lenguajes = new HashMap<>();
        lenguajes.put("HELLO", "ENGLISH");
        lenguajes.put("HOLA", "SPANISH");
        lenguajes.put("HALLO", "GERMAN");
        lenguajes.put("BONJOUR", "FRENCH");
        lenguajes.put("CIAO", "ITALIAN");
        lenguajes.put("ZDRAVSTVUJTE", "RUSSIAN");
        int i = 1;
        while (sc.hasNext()) {
            String cadena = sc.nextLine();
            if (cadena.equals("#")) {
                break;
            }
            if (lenguajes.containsKey(cadena)) {
                System.out.println("Case " + i + ": " + lenguajes.get(cadena));
            } else {
                System.out.println("Case " + i + ": UNKNOWN");
            }
            i++;
        }

    }

}
