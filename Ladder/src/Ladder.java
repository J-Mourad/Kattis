import java.util.Scanner;

public class Ladder {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int h = sn.nextInt();
		Short v = sn.nextShort();
		System.out.println( (int)Math.ceil( h / Math.sin(Math.toRadians(v) ) ) );
	}
}