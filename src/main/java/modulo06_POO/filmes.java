package modulo06_POO;

public class filmes {
    String titulo;
    String genero;
    int avaliacao;

    void assistir(){
        System.out.println("o filme vai começar");
    }
}

class filmeTest{ //usando a classe teste
    static void main(){ // método main de teste
        filmes movie1 = new filmes();
            movie1.titulo = "Spirit - O Corcel";
            movie1.genero = "Animação, Aventura";
            movie1.avaliacao = 200;
            movie1.assistir();
        filmes movie2 = new filmes();
            movie2.titulo = "Vingadores";
            movie2.genero = "Ação, Heroi";
            movie2.avaliacao = 150;
            movie2.assistir();
    }
}
