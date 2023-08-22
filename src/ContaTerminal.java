import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UI ui = new UI(sc);
        ContaBancaria conta = new ContaBancaria();

        String numeroAgencia = ui.pedeInfo("Por favor, informe o número da agência.");
        String nomeCliente = ui.pedeInfo("Por favor, informe o seu nome");
        int numeroConta = ui.pedeInt("Por favor, informe o número da sua conta");
        double saldo = ui.pedeDouble("Por favor, informe o saldo");

        conta.exibirInformacoesConta(nomeCliente, numeroAgencia, numeroConta, saldo);
    }
}
