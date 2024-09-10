import java.util.Scanner;

public class Movimentacao
{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Entre com o nome Completo do Titular da Conta");
        conta.setTitular(leitura.nextLine());
        System.out.println("Entre com Número da conta do Titular");
        conta.setNumeroconta(leitura.nextInt());
        System.out.println("Faça um Depóstio para sua conta");
        conta.depositar(leitura.nextInt());
        conta.dadosTitular();

    }
}
