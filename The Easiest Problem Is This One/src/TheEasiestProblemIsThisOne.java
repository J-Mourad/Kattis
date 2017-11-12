import java.util.Scanner;

public class TheEasiestProblemIsThisOne {	
	private static int sumDigit(int num) {
		int sum =0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
	}
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n;
		n = sn.nextInt();
		while(n != 0) {
			for(int p=11; p<1000000000; p++) {
				if(sumDigit(p*n) == sumDigit(n)) {
					System.out.println(p);
					break;
				}
			}
			n = sn.nextInt();
		}
	}
}