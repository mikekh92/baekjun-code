package Pro._2752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] line=br.readLine().split(" ");
		
		int[] arr = new int[3];
		
		for( int i=0; i<line.length; i++) {
			arr[i]=Integer.parseInt(line[i]);
		}
		Arrays.sort(arr);
		
		for(int i=0; i<line.length; i++) {
		if(i==line.length-1) {
			System.out.print(arr[i]);
		}else
			System.out.print(arr[i]+" ");
		}

	//	System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
	}
}
