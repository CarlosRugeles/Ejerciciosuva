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
        int t, i = 1, a, b, c;
        while (sc.hasNext()) {
            t = Integer.parseInt(sc.nextLine());
            i=1;
            while (t-- != 0 && t<20) {
                String[] array = sc.nextLine().split(" ");
                a = Integer.parseInt(array[0]);
                b = Integer.parseInt(array[1]);
                c = Integer.parseInt(array[2]);
                if (a > b) {
                    if (a > c) {
                        if (b > c) {
                            System.out.println("Case " + i + ": " + b);
                        } else {
                            System.out.println("Case " + i + ": " + c);
                        }
                    } else {
                        System.out.println("Case " + i + ": " + a);
                    }
                } else {
                    if (b > c) {
                        if (c > a) {
                            System.out.println("Case " + i + ": " + c);
                        } else {
                            System.out.println("Case " + i + ": " + a);
                        }                        
                    } else {
                        System.out.println("Case " + i + ": " + b);
                    }
                }
                i++;
            }
           
        }
    }

}