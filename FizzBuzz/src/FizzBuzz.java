import java.util.Scanner;

public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int x = sn.nextInt();
		int y = sn.nextInt();
		int n = sn.nextInt();
		
		for(int i=1; i<=n ; i++) {
			if(i%x == 0 && i%y ==0) {
				System.out.println("FizzBuzz");
				continue;
			}else if(i%x == 0) {
				System.out.println("Fizz");
				continue;
			}else if(i%y == 0) {
				System.out.println("Buzz");
				continue;
			}
			System.out.println(i);
		}
	}
}