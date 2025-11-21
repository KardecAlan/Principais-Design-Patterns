package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Capitao;

public class Luffy implements Capitao {

    @Override
    public void liderar() {
        IO.println("Luffy: Vamos achar o One Piece");
    }
}
