/**
 *
 * @author rugeles
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] paises = new String[t];

        for (int i = 0; i < t; i++) {
            paises[i] = br.readLine().split(" ")[0];
        }
        String temporal;
        for (int i = 0; i < t - 1; i++) {
            for (int j = i + 1; j < t; j++) {
                if (paises[i].compareTo(paises[j]) > 0) {
                    temporal = paises[i];
                    paises[i] = paises[j];
                    paises[j] = temporal;
                }
            }
        }
        temporal = paises[0];
        int count = 0;
        for (int i = 0; i < t; i++) {
            if (temporal.equals(paises[i])) {
                count++;
            } else {
                System.out.println(temporal + " " + count);
                temporal = paises[i];
                count = 1;
            }
        }
        System.out.println(temporal + " " + count);
        System.exit(0);
    }

}
