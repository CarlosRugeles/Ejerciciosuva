/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasePrincipal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;


/**
 *
 * @author carlos
 */
public class Main1 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws Exception {
        //long startTime = System.currentTimeMillis();
        //StringBuilder resultado = new StringBuilder();
       
            // TODO code application logic here

            BufferedReader br;
            BufferedWriter bw=new BufferedWriter(new FileWriter("respuesta.txt"));
            //Se revisa si existe algún archivo de texto plano para leer 
            File archivo=new File("entrada");
            
            if(archivo.exists()){
                br= new BufferedReader(new FileReader(archivo));
            }else{
                //Si no existe un archivo, entonces, se lee las entradas desde la consola
                br=new BufferedReader(new InputStreamReader(System.in));
            }
                           
                if (Integer.parseInt(br.readLine()) < 15) {//se garantiza que la primera línea de código que pertenece a t<15
                    String line = br.readLine();//Se pasa a la segunda línea escrita
                    do {
                        String[] linearray = line.split(" ");//Se separa la cadena ingresada en un arreglo. Se separa en donde se encuentra un espacio, porque se da por entendido que ya no hay dijitos que pertenezcan al primer número
                        //Se realizan las comparaciones para al final o escribir en un texto plano, o dar los resultados desde la consola.
                        if (Integer.parseInt(linearray[0]) == Integer.parseInt(linearray[1])) {
                            System.out.println("=");
                            bw.write("= \n");
                            //resultado.append("=");
                            //resultado.append(System.lineSeparator());
                        } else {
                            if (Integer.parseInt(linearray[0]) >= Integer.parseInt(linearray[1])) {
                                System.out.println(">");
                                bw.write("> \n");
                                //resultado.append(">");
                                //resultado.append(System.lineSeparator());
                            } else {
                                System.out.println("<");
                                bw.write("< \n");
                                //resultado.append("<");
                                //resultado.append(System.lineSeparator());
                            }
                        }
                        line = br.readLine();//se revisa si existe una línea siguiente para continuar con el proceso.
                    } while (line != null);
                    bw.close();
                    br.close();
                }

           
       
       
    }
}
