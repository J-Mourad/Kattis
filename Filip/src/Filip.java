import java.util.Scanner;

public class Filip {
	private static int miroir(int n) {
		int b,q,r;
		b=0; q=n;
		while(q!=0) {
			r = q%10;
			q = q/10;
			b = b*10+r;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int x = sn.nextInt();
		int y = sn.nextInt();
		
		x = miroir(x);
		y = miroir(y);
		System.out.println(Math.max(x, y));
	}
}