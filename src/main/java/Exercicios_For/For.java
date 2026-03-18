package Exercicios_For;
import java.util.Scanner;
public class For {
    static void main () {
        Scanner sc = new Scanner (System.in);
//        System.out.println ("Digite um número: ");
//        int n = sc. nextInt();
//
//        for (int i = 0; i<n; i++) {
//            System.out.println("contador: " + i);
//        }

//      Sequencia de Fibonacci
//        int seq;
//        System.out.println ("Escreva o termo: ");
//        int n = sc.nextInt();
//        int n0 = 0;
//        int n1 = 1;
//        for (n0 = 0; n>2;){
//            System.out.println(n0);
//            seq = n0 + n1;
//            n0 = n1;
//            n1 = seq;
//
//        }
//        System.out.print ("Digite o número da tabuada: ");
//        int num = sc.nextInt();
//        for (int tab = 0; tab <= 10; tab++){
//            int mult = tab * num;
//            System.out.println (mult);
//
//        }

//        For dentro do For
//        System.out.print ("Digite a constante de multiplicação: ");
//        int cons = sc.nextInt();
//        for (int i =1; i <= cons; i++){
//            for (int j =0; j <= 10; j++ ){
//                int result = i*j;
//                System.out.printf ("%d X %d = %d\n ", i,j, result );
//            }
//        }
//          PROCESSO DE BATELADA
        System.out.print("Digite o número de bateladas: ");
        int cicl = sc.nextInt();
        int i;
        int j;
        int total = 0;
        for (i = 1; i <= cicl; i++) {
            for (j = 1; j <= 5; j++){
                System.out.printf ("Produto número %d completo\n", j);
                total = i*j;
            }
            System.out.printf ("%dª batelada completa\n", i);
        }
//        System.out.printf ("Em %d bateladas foram feitos %d produtos", i(i-1), total);
        // não se deve usar variável de controle (i) para determinar um relatório final.
        System.out.printf ("Em %d bateladas foram feitos %d produtos", cicl, total);
    }
}