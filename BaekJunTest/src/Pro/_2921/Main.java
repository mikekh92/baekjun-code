package Pro._2921;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size =Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for (int i=0; i<=size; i++) {
			for( int j=i; j<=size; j++) {
				sum += i+j;
			}
		}
		System.out.println(sum);

	}

}
