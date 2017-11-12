import java.util.Scanner;

public class Autori {
    private static Scanner sn;

    public static void main(String[] args) {
        sn = new Scanner(System.in);
        
        String name = sn.nextLine();
        String[] Tab = name.split("-");
        
        for (String string : Tab) {
            System.out.print(string.charAt(0));
        }       
    }
}