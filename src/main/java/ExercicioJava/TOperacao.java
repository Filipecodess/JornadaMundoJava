package ExercicioJava;

import Exercicios_Poo.Triangulo;

import java.util.Scanner;
// calculo de dois triangulos X e Y com a formula de Heron
public class TOperacao {
    static void main(){
        Scanner sc = new Scanner (System.in);
        /*Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();*/
        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        //double sum = 0; // variável para soma
        // Triângulo X
        System.out.print ("Escreva os lados do triangulo X:");
        x.A = sc.nextDouble();
        x.B = sc.nextDouble();
        x.C = sc.nextDouble();

        double p = (x.A + x.B + x.C)/2; //
        System.out.println (p);
        double areaX = Math.sqrt(p*(p- x.A)*(p-x.B)*(p-x.C));
        System.out.printf("A área do tringulo X é de: %.2f \n", areaX);

        // Triangulo Y

        System.out.print ("Escreva os lados do triangulo Y:");
        y.A = sc.nextDouble();
        y.B = sc.nextDouble();
        y.C = sc.nextDouble();

        double q = (y.A + y.B + y.C)/2; //
        System.out.println (q);
        double areaY = Math.sqrt(p*(p- y.A)*(p-y.B)*(p-y.C));
        System.out.printf("A área do tringulo Y é de: %.2f \n", areaY);

        if (areaX > areaY){
            System.out.println("A maior área é o tringulo X");
        }
        else{
            System.out.println("A maior área é o triangulo Y");
        }


        sc.close();
    }
}
