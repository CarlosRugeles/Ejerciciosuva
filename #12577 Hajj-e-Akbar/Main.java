
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
        int i = 0;
        while (sc.hasNext()) {
            String cadena = sc.nextLine();
            if (cadena.equals("*")) {
                break;
            }
            i++;
            if (cadena.trim().equals("Hajj")) {
                System.out.println("Case " + i + ": Hajj-e-Akbar");
            } else {
                System.out.println("Case " + i + ": Hajj-e-Asghar");
            }
        }
    }

}
