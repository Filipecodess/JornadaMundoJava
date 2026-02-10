package modolu01_introducao;

import java.util.Locale; // import class, faz o java mudar de local

public class Aula01_OlaMundoSaidaDados {
    public static void main (String[] args) {
        // Saída de Dados e algumas formas de PRINT
//        System.out.print("Hello World!"); // print = uma linha
//        System.out.println("Filipe Araújo");
//        System.out.println("Hello World!"); // print = quebra de linha
//        System.out.println("Filipe Araújo");
//        System.out.printf("Meu nome é %s e tenho %d anos\n", "Filipe", 22);
//        //menu
//        System.out.print("======================================= ||");
//        System.out.printf("\nnome: %s                            || \nidade %d anos                           ||\n", "Filipe", 22);
//        System.out.print("======================================= ||");
//        System.out.printf("\npreço: %.4f",209631.2589 ); // no terminal é visto que a saída está como vírgula.
//        Locale.setDefault(Locale.US); //chama para import class
//        System.out.printf("\npreço: %.4f",209631.2589 );
        System.out.println ("===tabela de produtos===");
        System.out.printf("%-15s %-10s\n", "produto:", "preço:");
        System.out.printf("%-15s R$ %-10.2f\n", "Arroz", 150.0899);
        System.out.printf("%-15s R$ %-10.2f\n", "Fubá", 220.188896);
        System.out.printf("%-15s R$ %-10.2f\n", "Carne de Sol", 510.0899);

    }
}
