import java.io.*;

public class Main {
	static String cadena;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		while((cadena=br.readLine())!=null){
			System.out.println(Math.abs(Long.parseLong(cadena.split(" ")[0])-Long.parseLong(cadena.split(" ")[1])));
		}
	}
}
