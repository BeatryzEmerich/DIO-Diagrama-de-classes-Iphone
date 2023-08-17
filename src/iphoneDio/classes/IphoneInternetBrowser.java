package iphoneDio.classes;

import iphoneDio.interfaces.InternetBrowser;

public class IphoneInternetBrowser implements InternetBrowser {
    @Override
    public void exibePagina() {
        System.out.println("Exibindo site");
    }

    @Override
    public void fechaPagina() {
        System.out.println("Fechando página atual");
    }

    @Override
    public void addNovaPagina() {
        System.out.println("Abrindo nova pagina web");
    }

    @Override
    public void atualizaPagina() {
        System.out.println("Atualizando página atual");
    }
}
