package Exercicios_While;
import java.util.Scanner;
public class Ex_While {
   static void main(){

// Teste de Senha
//    Scanner sc = new Scanner (System.in);

//    System.out.print ("Digite a sua senha: ");
//    int senha = sc.nextInt();
//
//    while (senha != 2002) {
//        System.out.println ("Sua senha está inválida");
//        System.out.print ("Digite a sua senha novamente: ");
//        senha = sc.nextInt();
//    }
//        System.out.println ("Senha correta, acesso permitido");
//       sc.close();

// Plano cartesiano
//       Scanner sc = new Scanner (System.in);
//       System.out.print ("Digite aqui as suas coordenadas: ");
//       System.out.print ("X: ");
//       int x = sc.nextInt ();
//       System.out.print ("Y: ");
//       int y = sc.nextInt ();
//
//       while (x != 0 && y !=0) {
//
//           if (x > 0 && y > 0) {
//               System.out.println ("Primeiro Quadrante");
//           }
//           else if (x < 0 && y > 0) {
//               System.out.println ("Segundo Quandrante");
//           }
//           else if (x < 0 && y < 0) {
//               System.out.println ("Terceiro Quadrante");
//           }
//           else if (x > 0 && y < 0 ) {
//               System.out.println ("Quarto Quadrante");
//           }
//           System.out.print ("Digite aqui as suas coordenadas: ");
//           System.out.print ("X: ");
//           x = sc.nextInt();
//           System.out.print ("Y: ");
//           y = sc.nextInt ();
//       }
//       sc.close();

// Posto de Combustível

      Scanner sc = new Scanner (System.in);
      int alcool = 0;
      int gasolina = 0;
      int diesel = 0;

      System.out.println ("""
              1. álcool
              2. Gasolina
              3. Diesel
              4. Fim
              """);
      System.out.println ("Digite a opção de abastecimento: ");
      int opcao = sc.nextInt();
      while (opcao != 4) {
         switch (opcao) {
            case 1 -> {
               System.out.println("Você abasteceu com Álcool");
               alcool++;
            }
            case 2 -> {
               System.out.println("Você basteceu com Gasolina");
               gasolina++;
            }
            case 3 -> {
               System.out.println("Você abasteceu com Disel");
               diesel++;
            }
         }
         opcao = sc.nextInt();
      }
      System.out.println("MUITO OBRIGADO");
      System.out.println("Alcool: " + alcool);
      System.out.println("Gasolina: " + gasolina);
      System.out.println("Diesel: " + diesel);
      sc.close();
   }
}
