package O800;

import java.util.Scanner;

public class OddSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;
            for (int i = 0; i < 2*n; i++) {
                int x = sc.nextInt();
                if (x%2==0) even++;
                else odd++;
            }
            System.out.println(odd==even?"Yes":"No");
        }
    }
}
