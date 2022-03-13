package Pro;

import java.util.Scanner;
public class Main3{

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			int num1;
			int num2;
			
			
			
			for (int i=0; i<num; i++) {

				 num1 = sc.nextInt();
				 num2 = sc.nextInt();
				
				System.out.println(num1+num2);	
			}
			sc.close();

	}

}
