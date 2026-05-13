package Exercicios_Poo;

public class testeLivroDeBiblioteca {
    public static void main (String[] args){
        LivroDeBiblioteca Livro01 = new LivroDeBiblioteca();
        Livro01.nome = "Noites Brancas";
        Livro01.idioma = "Português";
        Livro01.Edicao = "2ª";
        Livro01.avaclientes = 4.9;
        Livro01.Editora = "Princips";
        Livro01.emprestado = false;
        Livro01.usuário = "Filipe";
        Livro01.dataEmprestimo = 20031011;

        System.out.println (Livro01.dataEmprestimo);

    }
}
