package Pro._2475;


import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		for (int i=0; i<5; i++) {
			int n = sc.nextInt();
			sum +=n*n;
		}
			System.out.println(sum%10);	

	}

}