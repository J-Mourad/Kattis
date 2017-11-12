import java.util.Scanner;

public class Server { 
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n,t,p,s=0;
        
        n = sn.nextInt();
        t = sn.nextInt();
        
        int i;
        for(i=1; i<= n; i++) {
            p = sn.nextInt();
            
            s += p;
          
            if(s > t ) {
                break;
            }
        }
        
    	System.out.println(i-1);
    }
}