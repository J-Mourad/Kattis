import java.util.HashSet;
import java.util.Scanner;

public class GrassSeedInc {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Double cost = sn.nextDouble();
		int l = sn.nextInt();
		Double Wi=0.0, Li=0.0, tmp=0.0;
		
		for(int i=0; i<l; i++) {
			Wi = sn.nextDouble();
			Li = sn.nextDouble();
			tmp += Wi*Li;
		}
		System.out.printf("%.7f", cost*tmp);
	}
}