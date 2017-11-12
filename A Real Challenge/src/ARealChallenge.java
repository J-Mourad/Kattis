import java.util.Scanner;
import java.util.Set;

public class ARealChallenge {
	private static Scanner sn;

	public static void main(String[] args) {
		sn = new Scanner(System.in);   	
		double squareArea = sn.nextDouble();
		double squarePerimeter = Math.sqrt(squareArea)*4;
		System.out.println(squarePerimeter);
	}
}