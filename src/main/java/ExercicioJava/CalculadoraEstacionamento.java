package ExercicioJava;
import java.util.Scanner;

import java.time.LocalTime;
import java.time.Duration;
public class CalculadoraEstacionamento {
    static void main (){
        Scanner sc = new Scanner(System.in);
        System.out.println ("O veículo entrou");
        String VEntrada = sc.next(); /* formato : HH:MM:SS */

        LocalTime Entrada = LocalTime.parse (VEntrada); /* entra como string e transforma em tempo */
        System.out.println ("Entrada:" + Entrada);

        System.out.println ("O veículo saiu");
        String VSaida = sc.next();

        LocalTime Saida = LocalTime.parse (VSaida);

        Duration tempo = Duration.between(Entrada, Saida);

        System.out.println ("Tempo de estacinamento: "+ tempo);
        double minutos = tempo.toMinutes(); /* converte horas em minutos (horas * 60 = minutos)*/
       /* if (minutos <=240) {
            System.out.print ("O valor a pagar é R$ 10,00");
        }
        else if (minutos <= 540) {
            System.out.print ("O Valor a pagar é de R$ 20,00");
        }
        else {
            System.out.print ("O valor a pagar é de R$ 50,00");
        } */

        // Por Taxa Fixa

        /* if (minutos <=240) {
            System.out.print ("O valor a pagar é de: R$ " + minutos * 0.05);
        }
        else if (minutos <= 540) {
            System.out.print ("O valor a pagar é de R$ :" + minutos * 0.05);
        }
        else {
            System.out.print ("O valor a pagar é de: R$ " + minutos * 0.05);
        }*/
        double TaxaPorMinutos = 0.05;
        System.out.println ("O valor a pagar é de: R$ " + minutos * TaxaPorMinutos);
        sc.close();
    }
}
