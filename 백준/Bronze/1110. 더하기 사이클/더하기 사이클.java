import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        int cycle = 0;
        boolean IsTrue = true;
        while(IsTrue) {
            int n1 = num/10;
            int n2 = num%10;
            int n3 = (n1+n2)%10;
            num = n2*10+n3;
            cycle++;
            if(N==num){
                break;
            }
        }
        System.out.println(cycle);

    }
}
