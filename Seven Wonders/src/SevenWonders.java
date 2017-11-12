import java.util.Scanner;

public class SevenWonders {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String s = sn.nextLine();
		char[] tab = s.toCharArray();
		int T=0, C=0, G=0;
		for (char d : tab) {
			switch(d) {
				case 'T': T++; break;
				case 'C': C++; break;
				case 'G': G++; break;
			}
		}
		System.out.println(7*Math.min(Math.min(T,C),G) + T*T+C*C+G*G);
	}
}