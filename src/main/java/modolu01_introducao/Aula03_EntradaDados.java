package modolu01_introducao;

import java.util.Scanner;

public class Aula03_EntradaDados {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in); // Objeto que será permitido a entrada de dados pelo console (teclado)

//        System.out.println("Digite seu nome e sobrenome: ");
//        String nome = sc.nextLine(); // nextLine() faz a leitura de texto grandes (uma linha inteira), temos o next() uma linha sem espaço.
//        System.out.println("Seu nome é: " + nome);
//
//        System.out.println ("Digite a sua idade: ");
//        int idade = sc.nextInt(); // leitura de numero inteiros.
//        System.out.println ("Sua idade é: " + idade + " anos");
//        // podemos usar para Double: sc.nextDouble();

//        System.out.println ("Digite seu nome");
        // char letra = sc.next().charAt(0); // Podemos localizar o caracter pela sua posição//
        //(o primeiro caracter sempre será 0)
//        System.out.println ("A primeira letra do seu nome é: " + letra);

//        System.out.println ("digite sua idade: ");
//        int idade1 = sc.nextInt();
//        System.out.println ("Sua idade é: " + idade1);
//        System.out.println ("digite seu nome: ");
//        sc.nextLine(); // limpa o buffer
//        String nome1 = sc.nextLine();
//        System.out.println ("Seu nome é: " + nome1);

        String nome1, nome2, nome3;

        nome1 = sc.nextLine();
        nome2 = sc.nextLine();
        nome3 = sc.nextLine();

        System.out.println("nomes digitados: ");
        System.out.println(nome1);
        System.out.println(nome2);
        System.out.println(nome3);
        // escrevemos o código até a quebra de linha
        sc.close(); // boa prática, encerra o bloco de entradas da dados
    }

}
