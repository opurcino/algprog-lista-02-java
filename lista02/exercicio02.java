
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Escreva o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Escreva o segundo número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        
        int subtracao = numero1 - numero2;

        int multiplicacao = numero1 * numero2;

        System.out.print("A soma é: " + soma + " , a subtracao é: " + subtracao + " , a multiplicacao é: " + multiplicacao);

        scanner.close();
    }
}
