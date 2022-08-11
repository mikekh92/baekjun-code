package Pro._1267;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int mSum = 0;
	int ySum =0;
	int sec;
	
	for ( int i=0; i<N; i++) {
		sec = sc.nextInt();
		ySum += ((sec/30)+1)*10;
		mSum +=((sec/60)+1)*15;
	}

	if(mSum==ySum) {
		System.out.println("Y M "+ySum);
	}else if(mSum<ySum){
		System.out.println("M "+mSum);
	}else if(mSum>ySum){
		System.out.println("Y "+ySum);
	}
	
	}

}
