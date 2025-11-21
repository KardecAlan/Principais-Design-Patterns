package desingpatterns.abstractfactory.concreteproducts;

import desingpatterns.abstractfactory.produtos.Capitao;

public class BarbaBranca implements Capitao {
    @Override
    public void liderar() {
        IO.println("Barba Branca: Vamos achar o One Piece");
    }
}
