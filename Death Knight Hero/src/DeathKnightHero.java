import java.util.Scanner;

public class DeathKnightHero {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		int t=0;
		String[] battles = new String[n];
		char[] ba;
		for(int i=0; i< n; i++) {
			battles[i] = sn.next();
			ba = battles[i].toCharArray();
			for(int j=0; j<ba.length-1; j++) {
				if(ba[j] == 'C' && ba[j+1] == 'D') {
					t++;
					break;
				}
			}		
		}
		System.out.println(n-t);	
	}
}