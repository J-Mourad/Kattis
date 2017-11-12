import java.util.HashSet;
import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int[] t = new int[10];
		// Whenever you want to prevent duplicates, you want to use a Set.
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<t.length; i++) {
			t[i]=sn.nextInt();
			set.add(t[i]%42);
		}
		System.out.println(set.size());
	}
}