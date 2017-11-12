import java.util.Scanner;

public class Trik {
	private static Scanner sn;

	public static void main(String[] args) {
		sn = new Scanner(System.in);
		
		String name = sn.nextLine();
		char[] Tab = name.toCharArray();
		int T[] ={1,0,0} ;
		int tmp;
		
		for (char c : Tab) {
			switch (c) {
			case 'A':
				tmp = T[1];
				T[1] = T[0];
				T[0] = tmp;
				break;
			case 'B':
				tmp = T[1];
				T[1] = T[2];
				T[2] = tmp;
				break;
			case 'C':
				tmp = T[2];
				T[2] = T[0];
				T[0] = tmp;
				break;
			}
		}
		for(int i=0; i<3; i++){
			if(T[i] == 1){
				System.out.print(i+1);
			}
		}
	}
}
