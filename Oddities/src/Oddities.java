import java.util.Scanner;

public class Oddities {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int[] Tab = new int[N];
		for(int i=0; i<N; i++) {
			Tab[i] = sn.nextInt();
			if(Tab[i]%2 == 0) {
				System.out.println(Tab[i] + " is even");
			}else {
				System.out.println(Tab[i] + " is odd");
			}
		}
	}
}