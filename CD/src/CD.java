import java.util.ArrayList;
import java.util.Scanner;

public class CD {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n = scan.nextInt();
			int m = scan.nextInt();

			if (n == 0 && m == 0)
				break;

			ArrayList<Integer> cds = new ArrayList<Integer>();

			int count = 0;

			for (int i = 0; i < n; i++)
				cds.add(scan.nextInt());

			for (int i = 0; i < m; i++)
				if (cds.contains(scan.nextInt()))
					count++;

			System.out.println(count);
		}

		scan.close();
	}
}