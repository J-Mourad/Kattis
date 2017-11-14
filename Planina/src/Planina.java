import java.util.Scanner;

public class Planina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println((int)Math.pow((Math.pow(2, n) + 1),2));  // (2^n +1)^2
	}
}
