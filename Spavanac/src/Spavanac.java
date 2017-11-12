import java.util.Scanner;

public class Spavanac {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int h = sn.nextInt();
		int m = sn.nextInt();
		if(h == 0) {
			h = 24;
		}
		int s = h*60 + m-45;
		h = s/60;
		m = s%60;
		System.out.println(h + " " + m);
	}
}