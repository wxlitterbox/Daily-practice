package distanceofcity;
import java.util.Scanner;
import java.util.ArrayList;

 class Main {
	private ArrayList<String> city = new ArrayList<String>();
	private int[][] distance = new int[city.size()][city.size()];
	
	
	public void cityadd(String s){
		city.add(s);
	}
	
	public void distanceadd(int[][] k){
		distance = k;		
	}
	
	public void getdistanceofcity(String a,String b){
		System.out.println(distance[city.indexOf(a)][city.indexOf(b)]);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main ciyt = new Main();
		String increase = in.next();
		int n = 0;
		while(increase.equals("###")==false){
			ciyt.cityadd(increase);
			n ++;
			increase = in.next();
		}
		int[][] distance = new int[n][n] ;
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++){
				distance[i][j]=in.nextInt();
			}
		ciyt.distanceadd(distance);
		ciyt.getdistanceofcity(in.next(), in.next());
		System.out.println("hello");
		in.close();
	}
}
