package O800;

import java.util.Scanner;

public class DislikeofThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int k = sc.nextInt();
            System.out.println(solve(k-1)==1?1:solve(k-1)+1);
        }
    }
    public static int solve(int k){
        int num3 = 0;
        if (k<=10) {
            if (k>=3) num3 = 1;
            else num3 = 0;
        }
        else num3 = k/10;
        int div3 = k/3>=2?(k/3)-1:0;
        return (k+num3+div3)%3==0?(k+num3+div3+1):(k+num3+div3);
    }
}
