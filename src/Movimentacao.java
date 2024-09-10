import java.util.Scanner;

public class Movimentacao {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        String menu = """
                    1 : Para informar o titular da Conta
                    2 : Para cadastrar o Número da Conta
                    3 : Para visualizar o Saldo da Conta 
                    4 : Para Realizar um novo Depósito 
                    5 : Para Realizar um novo Saque
                    6 : Para Sair do Sistema
                    """;
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 6) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine(); // Consome a nova linha deixada pelo nextInt()

            if (opcao == 6) {
                System.out.println("Aplicação Encerrada");
                leitura.close();
                break; // Sair do loop quando a opção for 6
            }

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do titular:");
                    conta.setTitular(leitura.nextLine());
                    break;
                case 2:
                    System.out.println("Digite o número da conta");
                    conta.setNumeroconta(leitura.nextInt());
                    break;
                case 3:
                    System.out.println("O Saldo da sua conta é de: R$ ");
                    conta.getSaldo();
                    break;
                case 4:
                    System.out.println("Digite o valor em R$ para deposito");
                    conta.depositar(leitura.nextInt());
                    break;
                case 5:
                    System.out.println("Digite o valor em R$ para sacar");
                    conta.sacar(leitura.nextInt());
                    break;

                // Adicione os demais cases aqui, se necessário
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
        conta.dadosTitular();
    }
}
