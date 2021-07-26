import java.util.*;

public class Uri_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double quad = 0;
		double cubo = 0;
		for (int i = 1; i <= n; i++) {
			
			quad = Math.pow(i, 2);
			cubo = Math.pow(i, 3);

			System.out.printf("%d %.0f %.0f \n",i, quad, cubo);

		}

	}
}
