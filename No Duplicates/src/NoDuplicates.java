import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {
    private static Scanner sn;

	public static void main(String[] args) {
    	sn = new Scanner(System.in);
    	ArrayList<String> line= new ArrayList<String>();    	
        Set<String> s = new HashSet<String>();
        
        while(sn.hasNext()) {
        	line.add(sn.next());
        }
        
        for (String a : line) {
        	s.add(a);        	
        }
        if(line.size() != s.size()) {
        	System.out.println("no");
        }else{
        	System.out.println("yes");
        }
    }
}