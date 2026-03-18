package Exercicios_Arrays;

import java.util.Scanner;
public class Arrays {
    static void main () {
        Scanner sc = new Scanner (System.in);
/* 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
seja, B[i] = A[i].*/

//        int[] A = new int[5];
//        int[] B = new int[5];
//        for (int i = 0; i<A.length;i++ ){
//            System.out.println("Digite um número para o espaço "+ i + ": ");
//            A[i]= sc.nextInt();
//            B[i]=A[i];
//        }
//        System.out.print ("Vetor A: ");
//        for(int i= 0; i<A.length;i++){
//            System.out.print (A[i] +  " ");
//        }
//
//        System.out.print ("\nVetor B: ");
//        for(int i= 0; i<B.length;i++){
//            System.out.print (B[i] +  " ");
//        }




/*2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho e com os elementos do vetor A multiplicados
por 2, ou seja: B[i] = A[i] * 2. */

        int [] vetorA = new int[2];
        int [] vetorB = new int[2];

        System.out.print("Digite números para os vetores: ");
        for (int i = 0; i<vetorA.length;i++){
            vetorA[i] = sc.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.print("\nvetor B: ");
        for (int i = 0;i<vetorB.length;i++){
            vetorB[i] = vetorA[i]*2;
            System.out.print (vetorB[i] + " ");
        }
    }
}
