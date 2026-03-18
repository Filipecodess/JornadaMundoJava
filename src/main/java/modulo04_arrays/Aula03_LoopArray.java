package modulo04_arrays;
import java.util.Scanner;
public class Aula03_LoopArray {
    static void main(){
        Scanner sc = new Scanner(System.in);
/*        double[] temp = {36.5, 38.71, 40, 37, 35.2, 35};
        for (int i = 0; i<temp.length; i++){
           System.out.println ("a temperatura do dia "+ (i+1) +" é de "+ temp[i] );
       } */

/*       int[] num = {20,25,30,40,80};
       for (int i = 0; i<num.length; i++){
          System.out.println ("No espaço " + i + " da Array, temos: "+num[i]);
        } */

//        int[] numero = {2,50,40,20};
//        int soma = 0;
//        for (int i = 0; i<numero.length; i++ ){
//            System.out.println(soma = soma + numero[i]);
//        }

        String[] carros = new String[3];
        /*carros[0] = "ferrari";
        carros[1] = "audi";
        carros[2] = "mercedes";*/
        for (String carro:carros){
            System.out.println (carro);
        }

    }
}
