import java.util.Scanner;

public class NastyHacks {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int N = sn.nextInt();
		int[] Tab = new int[3];
		for(int i=0; i<N; i++) {
			Tab[0] = sn.nextInt();
			Tab[1] = sn.nextInt();
			Tab[2] = sn.nextInt();
			if(Tab[0] < Tab[1]-Tab[2]) {
				System.out.println("advertise");
			}else if(Tab[0] > Tab[1]-Tab[2]) {
				System.out.println("do not advertise");
			}else {
				System.out.println("does not matter");
			}
		}
	}
}