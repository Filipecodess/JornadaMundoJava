package Exercicios_Poo;

public class TesteContaCorrente {
    static void main (){
        ContaCorrente conta = new ContaCorrente();
        conta.saldo = 1200;
        conta.codigo = "123";
        conta.limite = 3.000;

        conta.tipo = new String[] {"Especial","Normal"};
        System.out.printf("O seu limite é de R$%.2f\n",conta.limite);
        System.out.printf("O seu saldo é de R$%.2f",conta.saldo);


    }
}
