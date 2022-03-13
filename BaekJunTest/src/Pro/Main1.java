package Pro;

import java.util.Scanner;

// 2525¹ø
public class Main1 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			int hour= sc.nextInt();
			int minute= sc.nextInt(); 
			int time = sc.nextInt();
			int sum = minute + time;
			
			hour += sum/60;
			minute +=time - (60 *(sum/60));
			if( hour>=24) {
				hour -=24;
				System.out.println(hour + " " + minute);
				
				sc.close();
			}
		
					
		
	}

}
