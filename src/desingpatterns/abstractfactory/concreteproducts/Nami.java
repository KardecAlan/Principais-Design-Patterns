package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Navegador;

public class Nami implements Navegador {

    @Override
    public void navegar() {
        IO.println("Nami: Tempestade vindo do sul!");
    }

}
