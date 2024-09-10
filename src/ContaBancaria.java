 public class ContaBancaria {
 private  int numeroconta;
 private  int saldo;
 private String titular;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }

    public int getNumeroconta() {
        return numeroconta;
    }

    public void dadosTitular(){
        System.out.println("O nome completo do Titular é: " + titular);
        System.out.println("O Número da conta informado é: " + numeroconta);
        System.out.println("O Saldo atual é de: R$" + saldo);
    }

    public  void depositar (int valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("O valor de " + valor + " Foi despositado com sucesso");
        }else
            System.out.println("Deposito não realizado, favor verificar o valor informado");
    }

    public  void  sacar (int valor){
        if (valor > 0 && valor <= saldo){
            System.out.println("O Saque de :" + valor + "foi realizado com sucesso");
        }else
            System.out.println("Saldo insuficiente para saque");
    }

    public  void calculaSaldo(){
        System.out.println("O saldo atual é de: R$" + saldo);
    }

    public int getSaldo() {
        return saldo;
    }
}
