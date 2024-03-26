import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int orders = sc.nextInt();
        
        int[] bulbs = new int[num];
        
        for(int i = 0; i<num;i++){
            bulbs[i] = sc.nextInt();
        }
        for(int i=0; i<orders;i++) {
            int command = sc.nextInt();
            
            if(command==1) {
                int bulbIndex = sc.nextInt()-1;
                int state = sc.nextInt();
                bulbs[bulbIndex] = state;
            } else{
                int l = sc.nextInt()-1;
                int r = sc.nextInt();
                
                if(command==2) {
                    for(int j=l;j<r;j++){
                        bulbs[j]=(bulbs[j]==1)?0:1;
                    }
                } else if(command==3){
                    for(int j=l;j<r;j++){
                        bulbs[j]=0;
                    }
                } else if(command==4){
                    for(int j=l;j<r;j++){
                        bulbs[j]=1;
                    }
                }
                
                
                
            }
                
            }
        
    
    for(int i=0;i < num;i++){
        System.out.print(bulbs[i]+" ");
    }
    }
    
}