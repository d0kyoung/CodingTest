import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr = st.nextToken().toCharArray();
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            sum += Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);
    }
}