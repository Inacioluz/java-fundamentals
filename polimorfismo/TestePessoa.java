package polimorfismo;

public class TestePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setCpf("22255588877");
        professor.setNome("Carlos");
        professor.setIdade(22);
        professor.setSalario(10000);

        System.out.println(professor.imprimirDadosDaPessoa());
        
        
        Aluno aluno = new Aluno();
        aluno.setCpf("7555898855");
        aluno.setIdade(20);
        aluno.setNome("Ricardo");
        aluno.setMatricula("822");

        System.out.println(aluno.imprimirDadosDaPessoa());

    }
}
