import java.util.Scanner;

public class Pot {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int[] Tab = new int[N];
		double x=0;
		for(int i=0; i<N; i++) {
			Tab[i]= sn.nextInt();
		}
		for(int i=0; i<N; i++) {
			x += Math.pow((Tab[i]/10),(Tab[i]%10));
		}
		System.out.println((int)x);
	}
}