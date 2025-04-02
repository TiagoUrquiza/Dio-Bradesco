import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nome;
        float saldo;

        System.out.print("Digite um numero da conta: ");
        numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agencia = sc.nextLine();

        System.out.print("Digite o nome do cliente: ");
        nome = sc.nextLine();

        System.out.print("Digite o Saldo da conta: ");
        saldo = sc.nextFloat();

        ContaTerminal c1 = new ContaTerminal(numero, agencia, nome, saldo);
        c1.ImprimirDados();
    }
}
