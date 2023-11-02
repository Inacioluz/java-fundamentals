package pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.cpf = "22255588877";
        pessoa1.nome = "Carlos";
        pessoa1.idade = 22;

        System.out.println(pessoa1.imprimirDadosDaPessoa());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.cpf = "66644499922";
        pessoa2.nome = "Maria";
        pessoa2.idade = 37;

        System.out.println(pessoa2.imprimirDadosDaPessoa());
        
        
    }
}
