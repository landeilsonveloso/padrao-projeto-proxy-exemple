package classes;

public class Conta {
    private int numConta;
    private int numAgencia;
    private double saldo;

    public Conta() {
        numConta = 123456;
        numAgencia = 12;
        saldo = 1500;
    }

    public String getDados() {
        return new String( 
                            "\nNúmero da Conta: " + numConta +
                            "\nNúmero da Agencia: " + numAgencia +
                            "\nSaldo Atual: " + saldo
                        );
    }
}
