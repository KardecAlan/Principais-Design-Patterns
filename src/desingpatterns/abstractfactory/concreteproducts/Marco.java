package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Navegador;

public class Marco implements Navegador {

    @Override
    public void navegar() {
        IO.println("Marco: Vamos voar por essa rota!");
    }

}
