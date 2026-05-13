package Exercicios_Poo;

public class TesteContato {
    static void main(){
        Contato contato01 = new Contato();

        contato01.nome = "Filipe";
        contato01.email = "filipe@gmail.com";
        contato01.endereco = "rua A, 227";

        contato01.telefones = new String[3];
                contato01.telefones[2] = "98870-7793";
                contato01.telefones[1] = "98437-4369";
                contato01.telefones[0] = "98259-4789";

        System.out.println ("olá eu sou o "+ contato01.nome);
    }
}
