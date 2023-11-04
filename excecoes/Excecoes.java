package excecoes;

import polimorfismo.Pessoa;

public class Excecoes {

    // Checked exceptions

    // Unchecked exceptions

    public static void main(String[] args) throws Exception {

        // try
        // catch

        // try {
        //     validarNumero();
        // } catch (Exception e) {
        //     System.out.println("Deu muito ruim");
        // }


        Pessoa p = null;
        p = new Pessoa();
        
        p.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 40;

        if (numero < 100) {
            throw new Exception("O numero é menor que 100");
        }
    }
}
