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
        int t=sc.nextInt();
        while (t--!=0) {
            System.out.println(((int)sc.nextInt()/3) *((int)sc.nextInt()/3));
        }

        System.exit(0);
    }

}
