package pessoa;

public class Pessoa {
    //pessoa, idade, cpf
    //tipo nomen da váriavel
    String nome;
    int idade;
    String cpf;

    // Método para imprimir os dados da pessoa
    String imprimirDadosDaPessoa() {

        return "O nome da pessoa é " + nome + ". A idade da pessoa é "+ idade + ". O CPF dela é " + cpf + ".";
    }
}