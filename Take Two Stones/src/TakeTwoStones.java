import java.util.Scanner;

public class TakeTwoStones {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int X = sn.nextInt();
		if(X%2 ==0) {
			System.out.println("Bob");
		}else {
			System.out.println("Alice");
		}
	}
}