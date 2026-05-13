package modulo05_metodos;

public class testeCarro {
    static void main(){
        Carro esportivo = new Carro();
        esportivo.marca = "Ferrari";
        esportivo.modelo = "Spider";
        esportivo.capacidadeComb = 87.6;
        esportivo.consumoComb = 3.58;

        /*esportivo.exibirAutonomia();*/
        double autonomia = esportivo.obterAutonomia();
        System.out.println (esportivo.obterAutonomia());
        System.out.println ("A ferrari faz: " + autonomia + " km");
        System.out.println ("Para 10 km a qtd é " + esportivo.CalcularCombustivel(10));
        System.out.println ("Para 30 km a qtd é " + esportivo.CalcularCombustivel(30 /*Argumento*/));
        System.out.printf ("Para 50km a qtf é %.2f Litros", esportivo.CalcularCombustivel(50));
    }

}
