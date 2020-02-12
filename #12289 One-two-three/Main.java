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
            if (cadena.length() == 5) {
                System.out.println("3");
            } else {
                if ((cadena.charAt(0) == 'o' && cadena.charAt(1) == 'n') || (cadena.charAt(0) == 'o' && cadena.charAt(2) == 'e') || (cadena.charAt(1) == 'n' && cadena.charAt(2) == 'e')) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        }

    }

}
