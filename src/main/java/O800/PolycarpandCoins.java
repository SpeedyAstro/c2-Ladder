package O800;

import java.util.Scanner;

public class PolycarpandCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(5%3);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int a = n/3 + (n%3==1?1:0);
            int b = (n-a)/2;
            System.out.println(a+" "+b);
        }
    }
}
