package modulo04_arrays;
import  java.util.Scanner;
public class Aula01_ArraysSimples {
    static void main (){
        Scanner sc = new Scanner(System.in);
        // Acessando Arrays
//        String[] carros = new String [3];
//        carros[0] = "Ferrari";
//        carros[1] = "Bmw";
//        carros[2] = "Ford";
//
//        System.out.println(carros[0]);
//        System.out.println(carros[1]);
//        System.out.println(carros[2]);
//
//        String[]car = {"Ferrari", "Audi", "Mclaren", "Mercedes"};
//        car[0] = "Ford";
//        System.out.println(car[0]);
//        System.out.println(car[2]);
//        System.out.println(car[3]);
//        System.out.println(car.length);

//        double[] temp = {36.5, 38.71, 40, 37, 35.2, 35};
//        for (int i = 0; i<temp.length; i++){
//            System.out.println ("a temperatura do dia "+ (i+1) +" é de "+ temp[i] );
//        }

//        int[] num = {20,25,30,40,80};
//        for (int i = 0; i<num.length; i++){
//            System.out.println ("No espaço " + i + " da Array, temos: "+num[i]);
//        }

        int[] numero = {2,50,40,20};
        int soma = 0;
        for (int i = 0; i<numero.length; i++ ){
            System.out.println(soma = soma + numero[i]);
        }

    }
}
