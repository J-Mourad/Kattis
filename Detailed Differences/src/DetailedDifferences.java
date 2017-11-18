import java.util.Scanner;

public class DetailedDifferences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String line1 = null, line2=null;
		
		for(int i=0; i<testCases; i++) {
			line1 = sc.next();
			line2 = sc.next();
			System.out.println(line1);
			System.out.println(line2);
			for(int j=0; j<line1.length(); j++) {
				if(line1.charAt(j)==line2.charAt(j)) {
					System.out.print(".");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}