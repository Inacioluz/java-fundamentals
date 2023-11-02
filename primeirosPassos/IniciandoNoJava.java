package primeirosPassos;
public class IniciandoNoJava {
    public static void main(String[] args) {

        /*--------->  Iniciando com if e else  <--------------*/

        int dadoInt = 12;

        if (dadoInt == 10) {
            System.out.println("você entrou no if");
        } else if(dadoInt == 12 ) {
            System.out.println("Você entrou no pimeiro else");
        }
         else {
            System.out.print("Você entrou no else");
        }

        /*==============> WHILE <============= */

        int valorInicial = 6;

        while (valorInicial < 10 ) {
            System.out.println("10 é maior");
            valorInicial++;
        }

        /*==========> FOR <============== */

        for( int i = 0; i < 7; i++ ) {
            System.out.println("O valor do " +"I "+ "è " + i);
        }
    }
}
