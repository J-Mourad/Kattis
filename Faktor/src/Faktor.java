import java.util.Scanner;

public class Faktor {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int articles = sn.nextInt();
		int inpact = sn.nextInt();
		
		int x = articles*(inpact-1)+1;		
		/* x / published >  impact - 1
		 * x > published * (impact - 1)
		 * min { x in Z : x > published * (impact - 1) } = published * (impact - 1) + 1 */
		
		System.out.println(x);
	}
}