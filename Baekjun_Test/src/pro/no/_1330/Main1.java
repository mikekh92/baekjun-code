package pro.no._1330;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		sc.close();
		
		String str = (a>b)? " > " :	( (a<b) ? "<" : "==");
		System.out.println(str);
	}

}
