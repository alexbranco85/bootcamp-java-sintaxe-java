package edu.anatomiaclasses;
public class MinhaClasse {
    public static void main(String[] args) {
        // System.out.print("Caiu aqui!");

        String meuNome = "Alex";
        String segundoNome = "Branco";
        // int anoFabricacao = 2022;
        // boolean verdadeira = true;
        // if (anoFabricacao > 2023) {
        //     verdadeira = true;
        // } else {
        //     verdadeira = false;
        // }

        String nomeCompleto = nomeCompleto(meuNome, segundoNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome + " " + segundoNome;
    }
}