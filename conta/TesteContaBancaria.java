package conta;

public class TesteContaBancaria {
    
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria();

        contaBancaria1.setNumero("5624");
        contaBancaria1.setTitular("Inacio");
        contaBancaria1.setSaldo(100);

        contaBancaria1.depositar(200);
        contaBancaria1.sacar(50);
    }
}
