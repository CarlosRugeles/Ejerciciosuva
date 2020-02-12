/*
*
*
*@author rugeles
*/
import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		while((cadena=br.readLine())!=null){
			long n=Integer.parseInt(cadena);
			while(n--!=0){
				long f=Long.parseLong(br.readLine());
				long suma=0;
				while(f--!=0){
					String numero[]=br.readLine().split(" ");
					suma +=Long.parseLong(numero[0])*Long.parseLong(numero[2]);
				}
				System.out.println(suma);
			}
		}
	
	}

}

