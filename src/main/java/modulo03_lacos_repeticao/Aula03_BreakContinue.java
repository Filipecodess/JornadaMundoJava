package modulo03_lacos_repeticao;

import java.util.Scanner;

public class Aula03_BreakContinue {
    static void main() {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Digite um valor inicial: ");
        int num = sc.nextInt();

        System.out.println ("Digite o valor final: ");
        int fim = sc.nextInt();

//        for (int i = num; i <= fim; i++){
//            System.out.println (i);
//            if (i % 2 ==1) { // a condição é que eu só quero contar os número ímpares
//                System.out.println ("é ímpar" );
//                //break;
//            }
//            else {
//                System.out.println ("é par");
//                break;
//            }

//        }
        for (int i = num; i <= fim; i++){
            System.out.println (i);
            if (i % 5 ==0) {
                continue;
            }
            System.out.println ("não é  divisivel por 5" );

        }
    }
}
