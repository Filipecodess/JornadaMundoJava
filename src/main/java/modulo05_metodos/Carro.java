package modulo05_metodos;

public class Carro {
    String modelo;
    String marca;
    double capacidadeComb;
    double consumoComb;

    /* void exibirAutonomia(){
        System.out.printf("A autonomia do carro é: %.2f Km", capacidadeComb * consumoComb);
    } */
    double obterAutonomia(){
        return (capacidadeComb * consumoComb);
    }
    double CalcularCombustivel (double km){
        double qtdCombustivel = km/consumoComb;
        return qtdCombustivel;
    }
}

