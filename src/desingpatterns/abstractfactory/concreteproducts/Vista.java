package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Espadachim;

public class Vista implements Espadachim {

    @Override
    public void lutar() {
        IO.println("Vista: O espadachim das flores!");
    }
}
