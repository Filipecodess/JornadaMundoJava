package Exercicios_Poo;

public class testeLampada {
    public static void main (String[] args){
        lampada lampada01 = new lampada();
        lampada01.cor = "branco";
        lampada01.lumen = 17.5;
        lampada01.marca = "neo";
        lampada01.modelo = "led";
        lampada01.Tensao = "220V";

        /*lampada01.tipos = new String [3];
            lampada01.tipos[0] = "abajur";
            lampada01.tipos[1] = "bola";
            lampada01.tipos[2] = "fria";*/

        lampada01.tipos = new String[]{
                "abajur", "cilindro", "quente", "pisca"
        };
    }
}
