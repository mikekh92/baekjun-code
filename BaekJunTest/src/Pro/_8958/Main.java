package Pro._8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);

			
			String [] arr = new String [sc.nextInt()];
			
			for( int i=0; i<arr.length; i++) {
				arr[i]=sc.nextLine();
			}
			sc.close();
			
			for (int i=0; i<arr.length; i++) {
				
				int cnt=0; // 연속횟수
				int sum=0;// 누적 합산
				
				for(int j=0; j<arr[i].length(); j++) {
					
					if(arr[i].charAt(j)=='ㅇ') {
							cnt++;
					}
					else {
						cnt=0;
					}
					sum+= cnt;
				}
				System.out.println(sum);
			}
	}

}
