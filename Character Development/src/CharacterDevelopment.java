import java.util.*;

// Given n characters, there are 2^n subsets, n of which are singletons and 1 empty.
// Therefore we need 2^n - n - 1 relations to develop

public class CharacterDevelopment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int n = scan.nextInt();
        System.out.println((int)(Math.pow(2 , n) - n - 1));
    
        scan.close();
    }
}