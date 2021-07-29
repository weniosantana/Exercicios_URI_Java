import java.io.IOException;
import java.util.*;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Uri_1018 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
        Scanner sc = new Scanner(System.in);
        int notas = sc.nextInt();
        int vFinal = notas;
        int notas100 = vFinal / 100;
        vFinal -=notas100 * 100;
        int notas50 = vFinal / 50;
        vFinal -= notas50 * 50;
        int notas20 = vFinal / 20;
        vFinal -= notas20 * 20;
        int notas10 = vFinal / 10;
        vFinal -= notas10 * 10;
        int notas5 = vFinal / 5;
        vFinal -= notas5 * 5;
        int notas2 = vFinal / 2;
        vFinal -= notas2 * 2;
        int notas1 = vFinal;
        System.out.println(notas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }
 
}