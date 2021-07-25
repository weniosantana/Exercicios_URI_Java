import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1006 {
 
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
        double media;
        media = ((2*a)+(3*b)+(c*5))/10;
        System.out.println(String.format("MEDIA = %.1f", media));
    }
 
}