import java.util.Scanner;

public class ReversedBinaryNumbers {	
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		long inputInteger, outputInteger;
		String binary, reverseBinary;
		
		inputInteger = sn.nextLong();
		binary = Long.toBinaryString(inputInteger);
		
		StringBuffer buffer = new StringBuffer(binary);
		buffer = buffer.reverse();		
		reverseBinary = buffer.toString();
		
		outputInteger = Long.parseLong(reverseBinary, 2);
		
		System.out.println(outputInteger);
	}
}