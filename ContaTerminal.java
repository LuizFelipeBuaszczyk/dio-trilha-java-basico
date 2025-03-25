import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, primeiramente, digite o seu nome");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da sua agência.");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Digite o número da sua conta");
        Integer numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a quantidade que deseja depositar");
        Double saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é + " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}