import java.util.Scanner;

public class Aaah { 
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String FLine, SLine;
        FLine = sn.next();
        SLine = sn.next();
        if(FLine.length() < SLine.length()) {
        	System.out.println("no");
        }else {
        	System.out.println("go");
        }        
    }    
}