import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1036 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        if ((a == 0) | (b * b - 4 * a * c < 0)) {
			System.out.println("Impossivel calcular");
			return;
		}
        
        double bhaskara = Math.sqrt((b * b) - 4 * a * c);
        double r1 = (-b + bhaskara) / (2 * a);
        double r2 = (-b - bhaskara) / (2 * a);
        System.out.println(String.format("R1 = %.5f", r1));
        System.out.println(String.format("R2 = %.5f", r2));
        
    }
 
}