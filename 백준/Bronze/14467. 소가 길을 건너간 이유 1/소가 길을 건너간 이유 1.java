import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] positions = new int[11];
        
        Arrays.fill(positions, -1);
        
        int crossings = 0;
        
        for(int i=0;i<N;i++) {
            int cowNum = sc.nextInt();
            int position = sc.nextInt();
            
            if(position == 0 || position ==1) {
                if(positions[cowNum]!= -1&&positions[cowNum]!=position){
                    crossings++;
                }
                positions[cowNum] = position;
            }
            
        }
        System.out.println(crossings);
    }
}