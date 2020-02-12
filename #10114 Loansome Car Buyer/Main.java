
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int plazo, iteraciones, meses = 0;
        double cuota_inicial, valor_prestamo, avaluo_carro;
        double[][] depreciacion;
        while (sc.hasNext()) {
            String[] cadena = sc.nextLine().split(" ");
            plazo = Integer.parseInt(cadena[0]);
            iteraciones = Integer.parseInt(cadena[3]);
            cuota_inicial = Double.parseDouble(cadena[1]);
            valor_prestamo = Double.parseDouble(cadena[2]);
            avaluo_carro = valor_prestamo + cuota_inicial;
            depreciacion = new double[iteraciones][2];
            if (plazo < 0) {
                break;
            }
            for (int i = 0; i < iteraciones; i++) {
                cadena = sc.nextLine().split(" ");
                depreciacion[i][0] = Double.parseDouble(cadena[0]);
                depreciacion[i][1] = Double.parseDouble(cadena[1]);
            }
            avaluo_carro = (avaluo_carro) - (avaluo_carro * depreciacion[meses][1]);
            meses++;
            while (avaluo_carro < valor_prestamo) {

                for (int i = 1; i < iteraciones; i++) {
                    if (meses == depreciacion[i][0]) {
                        avaluo_carro = (avaluo_carro) - (avaluo_carro * depreciacion[i][1]);
                        valor_prestamo = valor_prestamo - cuota_inicial;
                        if (avaluo_carro < valor_prestamo) {
                            //System.out.println(meses + " months");
                            break;
                        }
                    } else {

                        while (meses < depreciacion[i][0]) {
                            avaluo_carro = (avaluo_carro) - (avaluo_carro * depreciacion[i - 1][1]);
                            valor_prestamo = valor_prestamo - cuota_inicial;
                            meses++;
                            if (avaluo_carro < valor_prestamo) {
                                //System.out.println(meses + " months");
                                break;
                            }
                        }

                    }
                }
                if (meses == 1) {
                    System.out.println("1 month");
                } else {
                    System.out.println(meses + " months");
                }

            }

        }

    }

}
