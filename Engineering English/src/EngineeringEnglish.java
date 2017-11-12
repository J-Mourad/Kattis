import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EngineeringEnglish {
	private static Scanner sn;

	public static void main(String[] args) {
		sn = new Scanner(System.in);   	
		Set<String> s = new HashSet<String>();
		String word;
		while(sn.hasNext()) {
			word = sn.next();

			if(s.contains(word.toLowerCase())) {
				System.out.print(". ");
			}else {        		
				s.add(word.toLowerCase());
				System.out.print(word + " ");
			}
		}
	}
}