/*
*@author: rugeles
ejercicio N°591
*/

import java.io.*;


public class Main{

	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		int t, casos=0;
		while ((cadena=br.readLine())!=null) {
			t=Integer.parseInt(cadena);
			if(t==0){
				break;
			}
			casos ++;
			int numeros[]=new int[t];
			String datos[]=br.readLine().split(" ");
			int suma=0;
			for (int i=0; i<t; i++) {
				numeros[i]=Integer.parseInt(datos[i]);
				suma +=numeros[i];
			}
			int maximo=(int) suma/t;
			suma=0;
			for(int i=0; i<numeros.length; i++){
				int resta=numeros[i]-maximo;
				if(resta>0){
					suma +=resta;
				}
			}
			System.out.println("Set #"+casos+"\nThe minimum number of moves is "+suma+".\n");
		}
	}
}
