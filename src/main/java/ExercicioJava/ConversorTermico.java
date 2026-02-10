package ExercicioJava;
import java.util.Scanner;
public class ConversorTermico {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double fahrenheit;
        double kelvin;
        double rankine;
        double celcius = 0;

//        System.out.print("""
//        1 para Fahrenheit
//        2 para Kelvin
//        3 para Rankine
//        0 para sair
//        Digite:""");
//        int conversor = sc.nextInt();
//        sc.nextLine();
        int conversor;

        do {
            System.out.print("""
                    1 para Fahrenheit
                    2 para Kelvin
                    3 para Rankine
                    0 para sair
                    Digite:""");
            conversor = sc.nextInt();
            sc.nextLine();

//            if (conversor == 1 || conversor == 2 || conversor == 3 ) {
//                System.out.print("Digite a temperatura em Celcius: ");
//                celcius = sc.nextDouble();
//            }

            if (conversor != 0) {
                System.out.print("Digite a temperatura em Celcius: ");
                celcius = sc.nextDouble();
            }
            switch (conversor) {
                case 1 -> {
                    fahrenheit = (celcius * (9.0 / 5.0)) + 32;
                    System.out.println("Temperatura em Fahrenheit é: " + fahrenheit);
                }
                case 2 -> {
                    kelvin = celcius + 273.15;
                    System.out.println("Temperatura em Kelvin é: " + kelvin);
                }
                case 3 -> {
                    rankine = (celcius + 273.15) * 1.8;
                    System.out.println("Temperatura em Rankine é: " + rankine);
                }
                default -> System.out.println("Você saiu!");

            }
        }
            while (conversor != 0) ;
            System.out.print("Finalizado!");
            sc.close();
    }

}

