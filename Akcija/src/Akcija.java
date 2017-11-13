import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Akcija {
	private static Scanner sn;

	public static void main(String[] args) {
		sn = new Scanner(System.in);   	
		int n = sn.nextInt();
		ArrayList<Integer> prices = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			prices.add(sn.nextInt());
		}
		int quotient = n/3;
		for(int i=0; i<quotient; i++ ){
			// Removing the minimum value in the arraylist
			prices.remove(prices.indexOf(Collections.min(prices)));
		}
		
		// Sum remaining prices
		long sum = 0;
		for(Integer p : prices) {			
			System.out.println(p);
			sum += p;
		}

		// print the minimal price
		System.out.println(sum);
	}
}