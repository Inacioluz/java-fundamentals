package primeirosPassos;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Inacio");
        nomes.add("Fernanda");
        nomes.add("Luiz");

        //System.out.println(nomes.get(2));

        // for( String nome : nomes) {
        //     System.out.println("O nome è " + nome);
        // }

        nomes.forEach(nome -> System.out.println("O nome è: " + nome));
    }
}
