import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1011 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
       	double pi = 3.14159;
		Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double volume = (4.0/3) * pi * Math.pow(r,3.0);
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
 
}