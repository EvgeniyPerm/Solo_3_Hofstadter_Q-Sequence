import java.util.Scanner;

public class Main {
    public static int funQ(int n){
        if (n<=0) return -1;
        if (n==1 || n==2) return 1;
        int[] seq = new int[n+1];
        seq[1]=1;
        seq[2]=1;
        for (int i = 3; i <= n; i++) {
            seq[i] = seq[i-seq[i-1]]+seq[i-seq[i-2]];

        }
        return seq[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(funQ(n));

    }
}