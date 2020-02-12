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
        while (sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- != 0) {
                long resultado = sc.nextLong() * 567;
                resultado /= 9;
                resultado += 7492;
                resultado *= 235;
                resultado /= 47;
                resultado -= 498;
//solución utilizando un método numérico
/*		resultado %=100;
		resultado /=10;
		System.out.println(Math.abs(resultado));
*/
//solución utilizando un método de cadena
                String r=""+resultado;
                System.out.println(r.charAt(r.length()-2));                
                
            }
        }

    }

}


