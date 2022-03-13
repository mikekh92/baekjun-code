package Pro;
//14681¹ø
import java.util.Scanner;

public class Main{
	 
		public static void place(int x, int y) {

			if(x>0&&y>0) {
				System.out.println("1");
			}else if(x>0&&y<0) {
				System.out.println("4");
			}else if(x<0&&y>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int y =sc.nextInt();
		sc.close();
		
		place(x, y);
		
		}
}
