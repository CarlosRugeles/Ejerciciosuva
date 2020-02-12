/**
 *
 * @author rugeles
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("         NAME                     SOUNDEX CODE");
        while (sc.hasNext()) {
            String cadena = sc.nextLine();
            String resultado =cadena.substring(0, 1);
            String espacios = "";
            for (int i = 0; i < 25 - cadena.length(); i++) {
                espacios += " ";
            }
            Map<String, Integer> valores = new HashMap<>();
            valores.put("B", 1);
            valores.put("P", 1);
            valores.put("F", 1);
            valores.put("V", 1);
            valores.put("C", 2);
            valores.put("S", 2);
            valores.put("K", 2);
            valores.put("G", 2);
            valores.put("J", 2);
            valores.put("Q", 2);
            valores.put("X", 2);
            valores.put("Z", 2);
            valores.put("D", 3);
            valores.put("T", 3);
            valores.put("L", 4);
            valores.put("M", 5);
            valores.put("N", 5);
            valores.put("R", 6);
            for (int i = 1; i < cadena.length(); i++) {
                if (valores.containsKey(cadena.substring(i, i + 1))) {
                    if (!Objects.equals(valores.get(cadena.substring(i - 1, i)), valores.get(cadena.substring(i, i + 1)))) {
                        resultado += valores.get(cadena.substring(i, i + 1));
                        if (resultado.length() == 4) {
                            break;
                        }
                    } 
                }
            }
            for (int i = resultado.length(); i < 4; i++) {
                resultado += "0";
            }

            System.out.println("         "+cadena+espacios+resultado);
        }
        System.out.println("                   END OF OUTPUT");
    }

}
