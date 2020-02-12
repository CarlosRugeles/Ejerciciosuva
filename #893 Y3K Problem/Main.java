/**
 * 
 */

/**
 * @author rugeles
 *
 */
import java.io.*;
import java.util.*;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		while(!(cadena=br.readLine()).equals("0 0 0 0")){
			String datos[]=cadena.split(" ");
			int desplazamientos=Integer.parseInt(datos[0]);
			int dia=Integer.parseInt(datos[1]);
			int mes=Integer.parseInt(datos[2]);
			int ano=Integer.parseInt(datos[3]);
			GregorianCalendar calendario=new GregorianCalendar(ano, mes-1, dia);
			calendario.add(Calendar.DATE, desplazamientos);
			System.out.println(calendario.get(Calendar.DATE)+" "+(calendario.get(Calendar.MONTH)+1)+" "+calendario.get(Calendar.YEAR));
		}
		
	}
	
	
}
