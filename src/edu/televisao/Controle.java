package edu.televisao;

public class Controle {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada " + smartTv.ligada);
        System.out.println("Canal " + smartTv.canal);
        System.out.println("Volume " + smartTv.volume);

        smartTv.ligarDesligar();
        System.out.println("TV ligada " + smartTv.ligada);
        smartTv.ligarDesligar();
        System.out.println("TV ligada " + smartTv.ligada);

        smartTv.aumentarDiminuirVolume("aumentar");
        smartTv.aumentarDiminuirVolume("aumentar");
        smartTv.aumentarDiminuirVolume("aumentar");
        smartTv.aumentarDiminuirVolume("diminuir");
        smartTv.aumentarDiminuirVolume("diminuir");

        smartTv.mudarCanal((14));


    }
}
