import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		String s = sn.next();
		char[] tab = new char[s.length()];
		tab = s.toCharArray();
		System.out.print(tab[0]);
		for(int i=1; i<tab.length; i++) {
			if(tab[i] == tab[i-1]) { continue; }
			System.out.print(tab[i]);
		}
	}
}