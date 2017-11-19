import java.util.ArrayList;
import java.util.Scanner;

public class CD {
	
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Integer> cdsJack = new ArrayList<Integer>();
	static ArrayList<Integer> cdsJill = new ArrayList<Integer>();
	public static void main(String[] args) {

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			if (n == 0 && m == 0)
				break;

			for (int i = 0; i < n; i++)
				cdsJack.add(scan.nextInt());
			
			for (int i = 0; i < m; i++)
				cdsJill.add(scan.nextInt());

	        int count = 0, ni = 0, mi = 0;

            while (ni < n && mi < m) {
                if (cdsJack.get(ni) > cdsJill.get(mi)) {
                    mi++;
                } else if (cdsJack.get(ni) < cdsJill.get(mi)) {
                    ni++;
                } else {
                    count++;
                    ni++;
                    mi++;
                }
            }
            System.out.println(count);
		}
		scan.close();
	}
}