import java.util.Scanner;

public class ColdPuterScience {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int x,k=0;
		for(int i=0; i<n; i++){
			x = sn.nextInt();
			if(x < 0){
				k++;
			}
		}	
		System.out.println(k);
	}
}