import java.util.Scanner;

public class ThreeDPrintedStatues { 
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int nStatues, nPrinters=1, nDays=0;
        nStatues = sn.nextInt();
        // While not enough printers to print all statues
        while(nPrinters < nStatues) {
        	// Print more printers
        	nPrinters *=2;
        	nDays++;
        }
        // Print Status next Day
        System.out.println(nDays + 1);
    }    
}