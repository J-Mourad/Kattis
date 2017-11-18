import java.util.Scanner;

public class CryptographerConundrum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String perName = "PER";
		String cipherText=sc.nextLine();
		int nDays=0;
		
		for(int i=0; i<cipherText.length(); i++) {
			if(cipherText.charAt(i) != perName.charAt(i%3)) nDays++;
		}
		System.out.println(nDays);
	}
}