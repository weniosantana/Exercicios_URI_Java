import java.util.Scanner;

public class Uri_1038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod;
		int quant;
		double resp = 0;
		cod = sc.nextInt();
		quant = sc.nextInt();
		if (cod == 1) {
			resp = quant * 4.00;
		}
		else if (cod == 2) {
			resp = quant * 4.50;
		}
		else if (cod == 3) {
			resp = quant * 5.00;
		}
		else if (cod == 4) {
			resp = quant * 2.00;
		}
		else if (cod == 5) {
			resp = quant * 1.50;
		}
		
		System.out.println(String.format("Total: R$ %.2f", resp));
	}

}
