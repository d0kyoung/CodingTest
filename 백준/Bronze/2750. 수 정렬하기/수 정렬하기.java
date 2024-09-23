import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] a = new int[T];
        for(int i=0;i<T;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int j : a) {
            System.out.println(j);
        }
    }
}
