package primeirosPassos;
import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        // Map<String, Integer> notas = new HashMap<>();
        // notas.put("Inacio", 800);
        // notas.put("fernanda", 6);
        // notas.put("Alisson", 8);

        // var nota = notas.get("Inacio");

        // System.out.println(nota);

        /*
         * =========================> Mostrando KEY's* <==========================*/

        Map<String, Integer> mapaIdades = new HashMap<>();

        // Inserindo pares chave-valor no HashMap
        mapaIdades.put("Alice", 28);
        mapaIdades.put("Bob", 22);
        mapaIdades.put("Charlie", 35);
        mapaIdades.put("David", 19);

        // Acessando valores por chave
        // System.out.println("Idade de Alice: " + mapaIdades.get("Alice"));

        // Ele pega todo o array

        // System.out.println("Idade de Bob: " + mapaIdades);

        /*
         * ==============> Verifiando se existe KEY<================================*/

        // String nome = "Bob";
        // if(mapaIdades.containsKey(nome)) {
        // System.out.println(nome + " => tem " + mapaIdades.get(nome) + " anos");
        // } else {
        // System.out.println(nome + " => Não foi encontrado no mapa");
        // }

        /*
         * ====================> Iterando sobre os pares chave-valor no HashMap
         * <=======================
         */

        // System.out.println("Pares chave-valor no mapa:");
        // for (Map.Entry<String, Integer> entry : mapaIdades.entrySet()) {
        //     String chave = entry.getKey();
        //     Integer valor = entry.getValue();
        //     System.out.println(chave + ": " + valor);

        // }

        // Removendo um par chave-valor do HashMap
        mapaIdades.remove("Charlie");

        // Verificando se o HashMap contém uma chave após a remoção
        System.out.println("O mapa contém a chave 'Charlie'? " + mapaIdades.containsKey("Bob"));
        System.out.println(mapaIdades);
    }
}
