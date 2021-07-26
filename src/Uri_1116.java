import java.util.Scanner;
public class Uri_1116 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b==0) {
				System.out.println("Divisão Impossivel");
			}
			else {
				int r = a/b;
				System.out.println(r);
			}
		
		}
		
	}

}
