import java.io.*;

class Mai{

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String cadena;
		while(!(cadena=br.readLine()).equals("0")){
			int t=resolver(cadena);
			while(t>=10){
				t=resolver(""+t);
			}
			System.out.println(t);
		}
		System.exit(0);
	}

	static int resolver(String cadena){
		if(cadena.length()==1){
			return Integer.parseInt(cadena);
		}else{
			return Integer.parseInt(cadena.substring(0,1))+resolver(cadena.substring(1,cadena.length()));
		}
	}
}