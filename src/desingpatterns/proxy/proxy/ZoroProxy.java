package desingpatterns.proxy.proxy;

import desingpatterns.proxy.realsubject.Luffy;
import desingpatterns.proxy.subject.Pirata;

public class ZoroProxy implements Pirata {

    private Luffy luffy;

    public ZoroProxy() {
        this.luffy = new Luffy();
    }

    @Override
    public void falarComLuffy() {
        if (temPermissao()){
            IO.println("Zoro: Pode falar com o capitão");
            luffy.falarComLuffy();
        } else {
            IO.println("Zoro: Sai fora! Não tem nada para falar com o capitão");
        }

    }

    private boolean temPermissao() {
        return Math.random() > 0.3;
    }
}
