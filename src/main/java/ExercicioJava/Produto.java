package ExercicioJava;

public class Produto {
    // poderia colocar o "public nos atributos da classe
    String nome;
    Double preco;
    int quantidade;

    public double TotalValueInStock()/*valor total em estoque (preço e quantidade)*/  {
        return preco * quantidade;
    }
    public void AddProducts(int quantidade){
        this.quantidade += quantidade; /*"this.quantidade" é a especificação que queremos entrar apenas na quantidade
        (variáveldo atributo da classe)*/
    }
    public void RemoveProducts (int quantidade){
        this.quantidade -= quantidade; /* aqui temos a "quantidade" como variável de atribuição e a
        "quantidade" como parâmetro */
    }
}
