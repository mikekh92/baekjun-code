package Pro._10871;
// random ���� �̿��ؼ� �غ�
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

			Scanner sc =  new Scanner(System.in);
			Random random= new Random(); 
			
			
			 int N = sc.nextInt();
			 int X = sc.nextInt();
			 
			 int[] Y  = new int[N];
			 
			 for(int i=0; i<N; i++) {
				Y[i]=random.nextInt(N+1);
				if(Y[i]<=X) {
				System.out.print(Y[i]+" ");
			 }
			 
			 }
			 sc.close();
	}

}
