import java.util.Scanner;

public class Bijele {
    private static Scanner sn;

    public static void main(String[] args) {
        sn = new Scanner(System.in);
        int T[] ={1,1,2,2,2,8};
        int tab[] = new int[6];
        for(int i=0; i<6; i++){
            tab[i] = sn.nextInt();
            tab[i] = T[i]-tab[i];
        }
        for (int i : tab) {
            System.out.print(i + " ");
        }
    }
}