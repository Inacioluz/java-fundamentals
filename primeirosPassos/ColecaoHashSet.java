package primeirosPassos;
import java.util.Set;
import java.util.HashSet;


public class ColecaoHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(15);
        numeros.add(16);
        numeros.add(17);
        numeros.add(18);
        numeros.add(19);
        numeros.add(20);    
        numeros.add(15);
        numeros.add(15);

        numeros.remove(20);

        //System.out.println(numeros.size());

        for (Integer elemento : numeros) {
            System.out.println(elemento);
        }
    }
}
