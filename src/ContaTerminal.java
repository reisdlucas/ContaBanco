import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        System.out.print("Número da agência: ");
        agencia = sc.next();
        System.out.print("Digite o seu nome: ");
        nomeCliente = sc.next();
        System.out.print("Insira seu saldo atual: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " +
                agencia + ", conta: " + numero + " e seu saldo: " + saldo + " já está disponível para saque.");
    }
}