import java.util.Scanner;

public class Uri_1040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		
		media = ((n1*2) + (n2*3) + (n3*4) + (n4*1)) / 10;
		
		System.out.println(String.format("Media: %.1f", media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado");
		}
		else if (media < 5.0) {
			System.out.println("Aluno reprovado");
			
		}	
		else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + exame);
        	media = (media + exame) / 2;
        	if (media >=5.0) {
        		System.out.println("Aluno aprovado");
        	}
        	else {
        		System.out.println("Aluno reprovado");
        	}
			System.out.println("Media final: " + media);
			
		}
		
		
		
		
		
		
	}

}
