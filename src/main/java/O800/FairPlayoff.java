package O800;

import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int[] arr = new int[2];
            int max1 = 0;
            int max2 = 0;
            for (int i = 0 ; i < 4 ; i++){
                arr[i%2] = sc.nextInt();
                if (arr[i%2] > max1){
                    max2 = max1;
                    max1 = arr[i%2];
                } else if (arr[i%2] > max2){
                    max2 = arr[i%2];
                }
            }
            int count = 0;
            count += arr[0] == max1  || arr[0] == max2 ? 1 : 0;
            count += arr[1] == max1  || arr[1] == max2 ? 1 : 0;
            System.out.println(count == 1 ? "YES" : "NO");
        }
    }
}
