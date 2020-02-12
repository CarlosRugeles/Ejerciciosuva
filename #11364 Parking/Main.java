import java.io.*;
class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	while(t--!=0){
		int len=Integer.parseInt(br.readLine());
		String cadena[]=br.readLine().split(" ");
		int mayor=Integer.parseInt(cadena[0]);
		int menor=mayor;
		while(len--!=0){
			if(Integer.parseInt(cadena[len])>mayor){
				mayor=Integer.parseInt(cadena[len]);
			}
			if(Integer.parseInt(cadena[len])<menor){
				menor=Integer.parseInt(cadena[len]);
			}
		}
		System.out.println((mayor-menor)*2);
	}
	
		}
}
