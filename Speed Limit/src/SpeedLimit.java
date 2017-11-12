import java.util.Scanner;

class DataSet{
	public int spead;
	public int time;
	
	public DataSet(int spead, int time) {
		super();
		this.spead = spead;
		this.time = time;
	}
	public int getSpead() {
		return spead;
	}
	public void setSpead(int spead) {
		this.spead = spead;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}

public class SpeedLimit {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n, s=0;
		DataSet[] tab = new DataSet[10];
		while(sn.hasNextInt()) {
			n = sn.nextInt();
			if(n == -1) { break; }			
			for(int i=0; i<n; i++) {
				tab[i] = new DataSet(sn.nextInt(), sn.nextInt());
			}
			for(int i=n-1; i>0; i--) {
				s += (tab[i].time - tab[i-1].time)*tab[i].spead;
			}
			s +=tab[0].time * tab[0].spead;
			System.out.println(s + " miles");
			s=0;
		}
	}
}