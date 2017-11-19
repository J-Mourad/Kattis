import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BlackFriday {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> outcomes = new ArrayList<Integer>();
	static Set<Integer> dupOuntcomes = new HashSet<Integer>();
	
	public static void main(String[] args) {
		int groupeSize = sc.nextInt();
		for(int i=0; i<groupeSize; i++) {
			int next = sc.nextInt();
			if(outcomes.contains(next)) {
				dupOuntcomes.add(next);
			}
			outcomes.add(next);
		}

		int max=0,indexMax=0;
		// search outcomes that are not duplicates and choose the max the the index of the max and print it
		for(int j=0; j< outcomes.size(); j++) {
			if(!dupOuntcomes.contains(outcomes.get(j))) {
				max = Math.max(max, outcomes.get(j));
				indexMax = outcomes.indexOf(max);
			}
		}
		
		if(max != 0) {
			System.out.println(indexMax+1);
		}else {
			System.out.println("none");
		}
	}
}