import java.io.BufferedInputStream;
import java.util.Scanner;

public class AlphabetSpam {
	private static void outputRatio(int group, int total) {
		System.out.println((double)group/total);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(new BufferedInputStream(System.in));
		
		char[] line = sc.nextLine().toCharArray();
		int whiteSpace=0, lowerCase=0, upperCase=0, others=0;
		
		for(char c: line) {
			if(c == '_') {
				whiteSpace++;
			}else if(Character.isLowerCase(c)) {
				lowerCase++;
			}else if(Character.isUpperCase(c)) {
				upperCase++;
			}else {
				others++;
			}
		}
		
		outputRatio(whiteSpace, line.length);
		outputRatio(lowerCase, line.length);
		outputRatio(upperCase, line.length);
		outputRatio(others, line.length);
	}	
}