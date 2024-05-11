package edu.tiposvariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Exemplo de Cast
        short numero = 1;
        int numeroInteiro = numero;
        // Aqui ocorre o cast que é o (short) para que tenhamos ciência de que esse número deve ser sempre short
        // Isso ocorre porque fiz um int na variável numeroInteiro e depois transformei em short novamente
        short numeroShort = (short) numeroInteiro;
        System.out.println(numeroShort);

        int returnNumero = variaveisConstantes(args);
        System.out.println(returnNumero);
    }

    public static int variaveisConstantes(String[] args) throws Exception {
        // Exemplo de Constantes - constantes devem receber sempre o final no início e por convenção recebe o nome em letras maiuscúlas
        final int NUMERO = 5;
        String nome = "Alex";
        System.out.println(nome);
        // NUMERO = 10;
        return NUMERO;
    }
}
