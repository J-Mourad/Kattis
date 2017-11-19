import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// If you use String concatenation in a loop, then you should use a StringBuilder 
public class SimonSays {
	public static void main(String[] args) throws IOException {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
		StringBuilder sb = new StringBuilder();
		String line;
		
		while((line = stdin.readLine()) != null) {
			// # if(line.length() >= 10 && line.substring(0, 10).equals("Simon says"))
			if(line.length() >= 10) {
				if(line.substring(0, 10).equals("Simon says")) {
					sb.append(line.substring(11) + "\n");
				}
			}
		}
		System.out.println(sb);
	}
}