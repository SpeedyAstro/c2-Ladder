package O800;

import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            for (int i = 1 ;;i++){
                if (i%3==0 || i%10==3) continue;
                if (--k==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
