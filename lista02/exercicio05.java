
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o preço da viagem para Alemanha? ");
        double valorAlemanha = scanner.nextDouble();

        System.out.print("Qual é a quantidade de pessoas para Alemanha? ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Qual é o preco da viagem para Portugal? ");
        double valorPortugal = scanner.nextDouble();

        System.out.print("Qual é a quantidade de pessoas para Portugal? ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Qual é o preço da viagem para Italia? ");
        double valorItalia = scanner.nextDouble();

        System.out.print("Qual é a quantidade de pessoas para Italia? ");
        int pessoasItalia = scanner.nextInt();


        int pessoasTotais = pessoasAlemanha + pessoasItalia + pessoasPortugal;

            double valorTotal = (pessoasAlemanha * valorAlemanha) + (pessoasPortugal * valorPortugal) + (pessoasItalia * valorItalia);

        System.out.print("A quantidade de pessoas que vão sera de " + pessoasTotais + " pessoas, e pagarão o total de R$" + valorTotal);

        scanner.close();
    }   
}