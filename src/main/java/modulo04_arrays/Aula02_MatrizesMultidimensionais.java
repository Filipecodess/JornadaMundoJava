package modulo04_arrays;
import java.util.Scanner;

public class Aula02_MatrizesMultidimensionais {
    static void main (){
        Scanner sc = new Scanner(System.in);
//        int [][] numero = {
//                {1,2,3},
//                {4,5,6,7,8,9,10},
//                {2,1}
//        };/* inicializando matriz com os valores*/
//        numero[1][0] = 2; // inserindo valor na linha 1 e coluna 0
//        numero[0][0] = 0; // inserindo valor na linha 0 e coluna 0
//        System.out.print (numero[0][0]);
//        System.out.print (numero[0][1]);
//        System.out.print (numero[0][2]);
//        System.out.print("\n");
//        System.out.print (numero[1][0]);
//        System.out.print (numero[1][1]);
//        System.out.print (numero[1][2]);
//        System.out.print("\n");
//
//       System.out.print(numero.length); /* quantidade de linha */
//        System.out.print(" x ");
//       System.out.print(numero[2].length); /* quantidade de colunas */
//        System.out.print("\n");
//        String [][] carros = new String [2][2]; /* inicializando como um tamnho determinado*/
//        carros [0][0] = "Audi";
//        carros [0][1] = "Ferrari";
//        carros [1][0] = "Mercedes";
//        carros [1][1] = "Hass";
//
//        System.out.println (carros[0][1]);

        // For aninhado Matriz
        String [][] carros = {
                {"Ferrari", "Audi", "Mercedes"},
                {"Mclaren", "Red-Bull","Hass"}
        };
        for (int i = 0; i<carros.length;i++ ){
            for(int j = 0; j<carros[i].length;j++)
                System.out.println(carros[i][j]);

        }

    }
}
