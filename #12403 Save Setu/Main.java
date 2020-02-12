/**
 *
 * @author rugeles
 */
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int cuenta = 0;
        while (t-- != 0) {
            String[] cadena = sc.nextLine().split(" ");
            if (cadena[0].equals("donate")) {
                cuenta += Integer.parseInt(cadena[1]);
            }
            if (cadena[0].equals("report")) {
                System.out.println(cuenta);
            }
        }
    }

}
