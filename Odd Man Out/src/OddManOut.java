import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OddManOut {
	public static void update(Set<Integer> set, int number) {
		// collect non repeated numbers
		if(set.contains(number)) {
			set.remove(number);
		}else {
			set.add(number);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCasesCount = sc.nextInt();
		for(int i=0; i<testCasesCount; i++) {
			Set<Integer> invitationNumbers = new HashSet<>();
			int gests = sc.nextInt();
			for(int j=0; j<gests; j++) {
				update(invitationNumbers, sc.nextInt());
			}
			System.out.printf("Case #%d: %d\n",i+1, invitationNumbers.iterator().next());
		}
		sc.close();
	}
}