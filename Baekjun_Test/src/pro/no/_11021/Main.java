package pro.no._11021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		
		int inputNumber = Integer.parseInt(br1.readLine()); 
		StringTokenizer str1;
		
		for ( int i =1; i<=inputNumber; i++ ) {
			str1= new StringTokenizer(br1.readLine()," " );
			System.out.println("Case #"+i+": "+  (Integer.parseInt(str1.nextToken())+Integer.parseInt(str1.nextToken()) ));
		}
			br1.close();
	}

}
