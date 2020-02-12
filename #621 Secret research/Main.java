
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
        while (t-- != 0) {
            String cadena = sc.nextLine();
            if (cadena.equals("1") || cadena.equals("4") || cadena.equals("78")) {
                System.out.println("+");
            } else {
                if (cadena.endsWith("35")) {
                    System.out.println("-");
                } else {
                    if (cadena.endsWith("4") && cadena.startsWith("9")) {
                        System.out.println("*");
                    } else {
                        if (cadena.startsWith("190")) {
                            System.out.println("?");
                        }
                    }
                }
            }

        }
    }

}
