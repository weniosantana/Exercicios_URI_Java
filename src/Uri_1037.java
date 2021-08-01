import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1037 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        double inter = sc.nextDouble();
        if(inter >= 0 && inter <= 25){
            System.out.println("Intervalo (0,25]");
        }
        else if(inter >= 25 && inter <= 50){
            System.out.println("Intervalo (25,50]");
        }
        else if(inter >= 50 && inter <= 75){
            System.out.println("Intervalo (50,75]");
        }
        else if(inter >= 75 && inter <= 100){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
    }
 
}