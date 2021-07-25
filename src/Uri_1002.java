import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1002 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        double n = 3.14159;
		double raio = sc.nextDouble();
		double area;
		area = n * Math.pow(raio, 2);
		DecimalFormat formatador = new DecimalFormat("0.0000");
		System.out.println("A=" + formatador.format(area));
    }
 
}