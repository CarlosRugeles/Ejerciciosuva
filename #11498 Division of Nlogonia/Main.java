
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
        int x, y, n, m;
        while (sc.hasNext()) {
            int k = Integer.parseInt(sc.nextLine());
            if (k == 0) {
                break;
            }
            String[] co = sc.nextLine().split(" ");
            n = Integer.parseInt(co[0]);
            m = Integer.parseInt(co[1]);
            while (k-- != 0) {
                co = sc.nextLine().split(" ");
                x=Integer.parseInt(co[0]);
                y=Integer.parseInt(co[1]);
                if(n==x || y==m){
                    System.out.println("divisa");
                }else{
                    if(x>n && y>m){
                        System.out.println("NE");
                    }else{
                        if(x<n && y>m){
                            System.out.println("NO");
                        }else{
                            if(x<n && y<m){
                                System.out.println("SO");
                            }else{
                                if(y<m && x>n){
                                    System.out.println("SE");
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
