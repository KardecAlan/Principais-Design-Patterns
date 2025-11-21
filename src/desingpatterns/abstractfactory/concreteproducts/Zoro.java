package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Espadachim;

public class Zoro implements Espadachim {
    @Override
    public void lutar() {
        IO.println("Zoro: Santoryu!");
    }
}
