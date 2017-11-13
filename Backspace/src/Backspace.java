import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Backspace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		ArrayList<Character> Tab = new ArrayList<Character>();
		String text = sc.nextLine();
		int t=0;
		for(int i = text.length()-1; i>=0 ; i--) {
			
			if(text.charAt(i) ==  '<') {
				t++;
				continue;
			}
			i = i - t;
			if(text.charAt(i) !=  '<') {
				Tab.add(text.charAt(i));
			}else {
				i--;
			}
			t=0;
		}
		Collections.reverse(Tab);
		for (Character character : Tab) {
			System.out.print(character);
		}
		sc.close();
	}
}
