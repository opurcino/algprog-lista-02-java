
import java.util.Scanner;

public class exercicio03{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escreva as suas quatro notas bimestrais: ");
        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        int nota4 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Sua média no semestre foi de: " + media);

        scanner.close();
    }    
}