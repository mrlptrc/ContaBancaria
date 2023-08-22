public class ContaBancaria {
    public void exibirInformacoesConta(String nomeCliente, String numeroAgencia, int numeroConta, double saldo) {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta conosco.");
        System.out.println("O número da agência é " + numeroAgencia + ", o número da conta é " + numeroConta + ", e o saldo é " + saldo);
    }
}