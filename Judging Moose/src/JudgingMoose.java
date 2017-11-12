import java.util.Scanner;

public class JudgingMoose {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Short l = sn.nextShort();
		Short r = sn.nextShort();
		
		if(l == 0 && r ==0) {
			System.out.println("Not a moose");
		}else if(l == r) {
			System.out.println("Even " + Math.round(2*r));
		}else {
			System.out.println("Odd " + Math.round(Math.max(l, r)*2));
		}
	}
}