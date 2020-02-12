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
        int secuencia = 0;
        while (sc.hasNext()) {
            secuencia++;
            String[] entrada = sc.nextLine().split(" ");
            if (entrada[0].equals("0")) {
                break;
            }
            int dispositivos = Integer.parseInt(entrada[0]);
            int acciones = Integer.parseInt(entrada[1]);
            int capacidad_fusible = Integer.parseInt(entrada[2]);
            int[] consumo_dispositivos = new int[dispositivos];
            boolean[] estado_dispositivo = new boolean[dispositivos];
            int mayor = 0;
            for (int i = 0; i < dispositivos; i++) {
                consumo_dispositivos[i] = Integer.parseInt(sc.nextLine());
                estado_dispositivo[i] = false;
            }
            int consumo = 0;
            boolean bandera = true;
            for (int i = 0; i < acciones; i++) {
                int di = Integer.parseInt(sc.nextLine());
                if (estado_dispositivo[di-1]) {
                    consumo -= consumo_dispositivos[di-1];
                } else {
                    consumo += consumo_dispositivos[di-1];
                }
                if (consumo > mayor) {
                    mayor = consumo;
                }
                if(bandera)bandera = consumo <= capacidad_fusible;
                estado_dispositivo[di-1] = !estado_dispositivo[di-1];
            }
            
            if (bandera) {
                System.out.println("Sequence " + secuencia + "\nFuse was not blown.\nMaximal power consumption was " + mayor + " amperes.\n");
            } else {
                System.out.println("Sequence "+secuencia+"\nFuse was blown.\n");
            }

        }
        System.exit(0);
    }

}
