import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1019 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int horas = n / 3600;
        n = n - horas * 3600;
        int minutos = n / 60;
        n = n - minutos * 60;
        int segundos = n;
        System.out.println(horas + ":" + minutos + ":" + segundos);

    
    }
 
}