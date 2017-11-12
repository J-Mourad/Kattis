import java.util.Scanner;

public class R2 {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int R1 = sn.nextInt();
		int S = sn.nextInt();
		int R2 =2*S - R1; 
		System.out.print(R2);
	}
}