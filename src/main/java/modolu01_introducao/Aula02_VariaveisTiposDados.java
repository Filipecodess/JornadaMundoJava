package modolu01_introducao;

public class Aula02_VariaveisTiposDados {
    public static void main(String[] args){
        // processamento de dados:
        // nome = "filipe" temos uma atribuição, um valor para uma variável, mas a variável deve ser tipada.
        String nome = "Meu nome é Filipe"; // tipo nomedavariável = valor(conforme o tipo)
        System.out.println (nome);

        // tipos INTEIROS:
        byte num = 127;
        System.out.println (num);
        // mesma coisa com short e long, existe apenas a dirença de tamanho e precisão dos caracteres.
        int idade;
        idade = 22;
        System.out.printf("tenho %d anos\n", idade);
        // Concatenação de variáveis
        // usamos o +
        int x,y;
        x = 10;
        y = 90;
        // System.out.println("soma é:" + x + y); // errado
        System.out.println("soma é:" + (x + y));

        // tipos PONTOS FLUTUANTES:
        float x1 = 2; // veja que eu tipei a variável para a operação de divisão = "float para divisão"
        float y2 = 5; // Caso eu faça a tipagem da variável em int para uma divisão, na operação farei casting.
        float div;
        div = x1/y2;
        System.out.println (div);
        // double é a mesma coisa, mas é ideal para esse tipo de operação.

        // tipos STRIGS E CHAR
        // é simples, tipo de dados para caracteres. String os carcteres são com "" e o Char são com ''
        String MeuNome = "Filipe";
        System.out.println("Meu nome é " + MeuNome);

        // tipos BOOLEAN
        // Veremos mais nas condicionais, é um tipo lógico em TRUE E FALSE.
        boolean nome1 = true;
        System.out.println(nome1);
        int quant = 20;
        float preco = 5.50f;
        double total = quant * preco;
        char din = '$';
        System.out.println ("valor por produto: " + din + preco);
        System.out.println ("Valor total: " + total);
        System.out.println ("Valor total: " + din + total);

        // Uso do tipo VAR
        // Substitui as tipagens, o compilador vai entender o tipo do valor atribuido.
        var xx = 10;
        System.out.println (xx);
        var yy = 2.5f;
        System.out.println (yy);
        // CONSTANTE
        final int NUMERO = 200;
       // NUMERO = 2; // já é visivel o erro. Não sobreescreve.

        // tipos de CASTING:
        int x2, y3;
        double res;
        x2 = 2;
        y3 = 8;
        res = (double) 2/8;

        int n;
        double a;

        a = 5.2;
        //n = a; // veja que aqui não tem como fazer a saida do dados, um double não vira int
        n = (int) a; // Aqui perdemos informação
        System.out.println (n);


    };

}
