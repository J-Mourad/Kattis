import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int X = sn.nextInt();
		int N = sn.nextInt();
		int val=X;
		for(int i=0; i<N; i++) {
			val = val + (X-sn.nextInt());
		}
		System.out.println(val);
	}
}