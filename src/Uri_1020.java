import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1020 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        int rDias = sc.nextInt();
        
        int ano = rDias / 365;
        rDias -= ano * 365;
        int mes = rDias / 30;
        rDias -= mes * 30;
        
	        System.out.println(ano + " ano(s)");
	        System.out.println(mes + " mes(es)");
	        System.out.println(rDias + " dia(s)");
    }
 
}