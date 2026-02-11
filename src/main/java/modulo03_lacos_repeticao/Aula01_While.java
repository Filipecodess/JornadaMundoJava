package modulo03_lacos_repeticao;

public class Aula01_While {
    static void main(){
//        while (true) {
//            System.out.println("infinito");
//        } - É um loop infinito, enquanto for verdade ele não para, isso é perigoso!

//        int contador = 0;
//        while (contador <=5){
//            System.out.println("contador:" + contador);
//            contador++;
//
//        }
//        int regressiva = 10;
//
//        while (regressiva >= 1){
//            System.out.println (regressiva);
//            regressiva--;
//        }
//
//            System.out.println ("Feliz Ano Novo!");
        // Do While (faça{} enquanto ())
        int i = 5;
        do {
            System.out.println(i);
            i--;
        }
        while (i >= 1);

        System.out.println("Feliz 2026");
    }
}
