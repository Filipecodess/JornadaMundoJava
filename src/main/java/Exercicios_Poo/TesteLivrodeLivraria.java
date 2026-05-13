package Exercicios_Poo;

public class TesteLivrodeLivraria {
    public static void main (String[] args){
        LivroDeLivraria Livro01 = new LivroDeLivraria();
        Livro01.nome = "Noites Brancas";
        Livro01.idioma = "Português";
        Livro01.Edicao = "2ª";
        Livro01.avaclientes = 4.9;
        Livro01.Editora = "Princips";
        Livro01.preco = 50.90;

        System.out.printf("O preço do livro %s é de R$%.2f", Livro01.nome, Livro01.preco);
    }
}
