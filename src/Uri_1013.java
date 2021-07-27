import java.util.Scanner;

public class Uri_1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        
        if(valor1>=valor2 && valor1>=valor3){
            System.out.println(valor1 + " eh o maior");
        }
        else if(valor2>=valor1 && valor2>=valor3){
            System.out.println(valor2 + " eh o maior");
        }
        else if(valor3>=valor1 && valor3>=valor2){
            System.out.println(valor3 + " eh o maior");
        }
	}

}
