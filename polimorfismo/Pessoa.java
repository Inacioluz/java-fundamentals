package polimorfismo;

public class Pessoa {
    //pessoa, idade, cpf
    //tipo nomen da váriavel
    private String nome;
    private int idade;
    private String cpf;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }

    // Método para imprimir os dados da pessoa
    String imprimirDadosDaPessoa() {

        return "O nome da pessoa é " + nome + ". A idade da pessoa é "+ idade + ". O CPF dela é " + cpf + ".";
    }
}