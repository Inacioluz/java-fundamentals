package conta;

public class ContaBancaria {
    
    private String numero;
    private String titular;
    private double saldo;
  
    //Constructor
    public ContaBancaria() {
        saldo = 0.0;
    }
    //Guetters e Setters

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    

    void depositar(double valor ) {
        if ( valor > 0) {
            saldo =  saldo + valor;
            System.out.println("Depósito de R$ " + valor + " saldo atual " + saldo);
        } else {
            System.out.println("O valor de depósito é inválido");
        }
    }

    //sacar

    void sacar( double valor ) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque no valor de R$ " + valor + " Saldo atual " + saldo);
        }
    }


}
