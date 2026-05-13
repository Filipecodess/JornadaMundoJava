package modulo06_POO;

class cachorro { // classe para o tipo de objeto
    int tamanho;
    String breed;
    String name;

    void latir(){
        System.out.println("au! au!");
    }
    void falarnome(){
        System.out.println (name);
    }
}

class testeCachorro{ //classe do objeto teste
    static void main(String[] args) {
        cachorro viraLata = new cachorro();// criação de um objeto
        viraLata.name = "duke";
        viraLata.tamanho = 20;
        viraLata.latir(); // operando o método
        viraLata.falarnome();

    }
}