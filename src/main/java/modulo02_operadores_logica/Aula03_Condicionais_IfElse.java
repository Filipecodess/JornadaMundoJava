package modulo02_operadores_logica;
import java.util.Scanner;
public class Aula03_Condicionais_IfElse {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
//        System.out.println ("Escolha um número");
//        int numero = sc.nextInt();
//        if (numero%2 == 0){
//            System.out.printf ("%d é um número par", numero);
//            }
//        else {
//            System.out.printf ("%d é um número ímpar", numero);
//        }
//        System.out.println ("Escolha um número");
//        int numero = sc.nextInt();
//        if (numero > 0) {
//            System.out.printf ("O número %d é número POSITIVO", numero);
//        }
//        else {
//            System.out.printf ("O número %d é NEGATIVO", numero);
//        }

        System.out.print ("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println ("Bem-vindo, Filipe");
        System.out.println ("Digite a sua primeira nota: ");
        int n1 = sc.nextInt();
        System.out.println ("Digite a sua segunda nota: ");
        int n2 = sc.nextInt();
        System.out.println ("Digite a sua terceira nota: ");
        int n3 = sc.nextInt();

        double nota = (double) (n1+n2+n3)/3;
        System.out.printf ("Sua nota é: %.2f\n", nota);

        if (nota >= 7) {
            System.out.printf ("%s, você está APROVADO", nome);
        }
        else if (nota == 6) {
            System.out.printf("%s, você fará a prova de RECUPERAÇÃO\n", nome);
            System.out.print ("Qual sua nota da recuperação: ");
            double notaRec = sc.nextDouble();
            double mediaFinal = (double) (nota + notaRec)/2;
            System.out.printf ("Minha nota de Recuperação é %.2f\n", notaRec);
            if (mediaFinal > 6){
                System.out.printf ("%s, você está APROVADO POR MÉDIA\n", nome);
            }
            else {
                System.out.printf ("%s, você esá reprovado por média", nome);
            }
        }
        else {
            System.out.printf ("%s, você está REPROVADO", nome);
        }
        sc.close();
    }
}
