package edu.televisao;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 1;

    public void aumentarDiminuirVolume(String metodo) throws Exception {
        if(metodo.equalsIgnoreCase("diminuir")) {
            volume--;
            System.out.println(volume);
        } else if (metodo.equalsIgnoreCase("aumentar")) {
            volume++;
            System.out.println(volume);
        }
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal: " + canal);
    }

    public void ligarDesligar() {
        ligada = !ligada;
    }
}
