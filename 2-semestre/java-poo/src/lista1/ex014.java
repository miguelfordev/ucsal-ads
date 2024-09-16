package lista1;
import java.util.Scanner;
public class ex014 {

    public static void main(String[] args) {
    	/*14) Faça um programa que receba um número N e mostre na tela os N primeiros números primos.*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("O valor de N deve ser um número inteiro positivo.");
            return;
        }
        int count = 0;
        int num = 2;   
        while (count < N) {
            if (ePrimo(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean ePrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}

