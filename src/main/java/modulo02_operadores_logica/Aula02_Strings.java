package modulo02_operadores_logica;

public class Aula02_Strings {
    public static void main (String[] args){

        //método
        String txt = "Filipe Thalita";
        System.out.println ("o comprimento do texto é: " + txt.length());

        String nome = ("Filipe Gabriel da Silva Araujo");
        System.out.println (nome.toUpperCase());
        System.out.println (nome.toLowerCase());

        System.out.println (nome.indexOf("da"));
        System.out.println (nome.charAt(15));

    }
}
