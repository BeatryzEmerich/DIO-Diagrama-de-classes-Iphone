package iphoneDio.classes;

import iphoneDio.interfaces.Phone;

public class IphonePhone implements Phone {

    @Override
    public void liga() {
        System.out.println("Ligando para Steve Jobs");
    }

    @Override
    public void desliga() {
        System.out.println("Desligando ligação");
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }
}