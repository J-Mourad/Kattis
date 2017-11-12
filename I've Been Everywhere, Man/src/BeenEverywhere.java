import java.util.HashSet;
import java.util.Scanner;

public class BeenEverywhere {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Short t = sn.nextShort();
		Short n=0;
		// A Set is a Collection cannot contain duplicate elements.
		HashSet<String> cities = new HashSet<String>();
		for(int i = 0; i< t; i++) {
			n = sn.nextShort();
			for(int j =0; j<n; j++) {
				cities.add(sn.next());
			}
			System.out.println(cities.size());
			cities.clear();
		}
	}
}