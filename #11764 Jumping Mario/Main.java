import java.io.*;


class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int t=Integer.parseInt(br.readLine());
	int caso=0;
	while(t--!=0){
		caso++;
		int jumps=Integer.parseInt(br.readLine());
		String input[]=br.readLine().split(" ");
		int high=0,low=0;
		for(int i=0; i<jumps-1; i++){
			if(Integer.valueOf(input[i])>Integer.valueOf(input[i+1])){
				low ++;
			}
			if(Integer.valueOf(input[i])<Integer.valueOf(input[i+1])){
				high ++;
			}
		}
		System.out.println("Case "+caso+": "+high+" "+low);
	}
	
		}
}
