public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = 5000.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

        public static void main(String[] args) {
            ContaBancaria conta = new ContaBancaria(4320, "Bruno");

            conta.depositar(1000.0);
            System.out.println("Saldo atual: " + conta.getSaldo());
    
            conta.sacar(500.0);
            System.out.println("Saldo atual: " + conta.getSaldo());
        }

}