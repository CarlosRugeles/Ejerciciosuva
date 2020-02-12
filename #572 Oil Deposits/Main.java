import java.io.*;

/**
 *
 * @author rugeles
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static String[] vector;
    static boolean [][] visitados;
    static int filas;
    static int columnas;
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String cadena;        
        
        while((cadena=br.readLine())!=null){
            filas=Integer.parseInt(cadena.split(" ")[0]);
            columnas=Integer.parseInt(cadena.split(" ")[1]);
            if(filas==0)break;
            vector=new String[filas];
            visitados=new boolean[filas][columnas];
            for (int i = 0; i < filas; i++) {
                vector[i]=br.readLine();
            }
            int contador=0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (!visitados[i][j] && vector[i].charAt(j)=='@') {
                        contador ++;
                        encontrarAdyacencia(i, j);
                    }
                }
            }
            System.out.println(contador);
        }
    }
    
    public static boolean esValido(int x, int y){
        return (x>=0 && x<filas && y>=0 && y<columnas);
    }
    
    public static void encontrarAdyacencia(int x, int y){
        if (!esValido(x, y) || visitados[x][y] || vector[x].charAt(y)!='@') {
            return;
        }
        visitados[x][y]=true;
        encontrarAdyacencia(x-1, y+1);
        encontrarAdyacencia(x, y+1);
        encontrarAdyacencia(x+1, y+1);
        encontrarAdyacencia(x+1, y);
        encontrarAdyacencia(x+1, y-1);
        encontrarAdyacencia(x, y-1);
        encontrarAdyacencia(x-1, y-1);
        encontrarAdyacencia(x-1, y);
    }
    
}

