import java.util.Locale;
import java.util.Scanner;

public class MyFirstBank {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);
        String nomeCliente = "Sarah Silva";
        String tipoConta = "Conta Corrente";
        Double saldo = 2500.00;
        int opcao = 0;
        Double transferir = 0.00;
        Double depositar = 0.00;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nomeCliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************\n\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Depositar valor 
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();
            if (opcao < 1 || opcao > 4){
                System.out.println("Opcao invalida\n");
            } else if (opcao == 1) {
                System.out.println("Seu saldo e de R$ " + saldo + "\n");

            } else if (opcao == 2) {
                System.out.println("Qual valor deseja transferir?\n");
                transferir = leitor.nextDouble();
                if (transferir > saldo) {
                    System.out.println("Nao ha saldo insuficiente" + "\n");
                } else {
                    saldo -= transferir;
                    System.out.println("Seu novo saldo e: R$ " + saldo + "\n");
                }

            } else if (opcao == 3) {
                System.out.println("Qual valor deseja depositar? \n");
                depositar = leitor.nextDouble();
                if (depositar <= 0) {
                    System.out.println("Nao e possivel depositar esse valor \n");
                } else {
                    saldo += depositar;
                    System.out.println("Seu novo saldo e: R$ " + saldo + "\n");
                }

            } else if (opcao == 4) {
                System.out.println("Sistema encerrado\n");
                break;
            }
        }

    }
}
