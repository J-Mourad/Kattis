import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int x = sn.nextInt();
        int y = sn.nextInt();
        if(x > 0){
            if(y > 0){
                System.out.print(1);
            }else{
                System.out.print(4);
            }
        }else{
            if(y > 0){
                System.out.print(2);
            }else{
                System.out.print(3);
            }
        }
    }
}