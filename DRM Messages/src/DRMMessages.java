import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DRMMessages {
	private final static Map<Integer, Character> alphabetNumbers = new HashMap<>(30);
	private final static Map<Character, Integer> numberAlphabet = new HashMap<>(30);
	
	private static void rotate(char[] half) {
		int sumValCaracter =0;
		for(int i=0; i<half.length; i++) {
			sumValCaracter += numberAlphabet.get(half[i]);
		}
		for(int i=0; i<half.length; i++) {
			half[i]=alphabetNumbers.get((numberAlphabet.get(half[i])+sumValCaracter)%26);
		}
	}
	public static void main(String[] args) {
		char c='A';
		int t;
		// Fill maps with characters and equivalent numbers
		for(int i=0; i<=25; i++ ) {			
			alphabetNumbers.put(i, c);
			numberAlphabet.put(c, i);
			c++;
		}
		Scanner sc = new Scanner(System.in);
		String message = sc.nextLine();
		// Devide
		char[] half1 = message.substring(0, message.length()/2).toCharArray();
		char[] half2 = message.substring((message.length()/2), message.length()).toCharArray();
		
		// Rotate
		rotate(half1);
		rotate(half2);
		
		// Merge
		for(int i=0; i<half2.length; i++) {
			t = numberAlphabet.get(half2[i]);
			half1[i]=alphabetNumbers.get((numberAlphabet.get(half1[i])+t)%26);
			System.out.print(half1[i]);
		}
	}
}
