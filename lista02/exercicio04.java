
import java.util.Scanner;

public class exercicio04{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Qual é o preço da gasolina? \n");
        double precoGasolina = scanner.nextDouble();

        
        System.out.print("Quantos litros você comprou?");
        double litrosGasolina = scanner.nextDouble();

        
        double pagamento = precoGasolina * litrosGasolina;

        System.out.print("Você vai pagat o total de R$" + pagamento);

        scanner.close();
    }
}