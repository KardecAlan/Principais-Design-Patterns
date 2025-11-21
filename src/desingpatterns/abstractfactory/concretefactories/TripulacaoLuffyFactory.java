package desingpatterns.abstractfactory.concretefactories;

import desingpatterns.abstractfactory.abstractfactory.TripulacaoFactory;
import desingpatterns.abstractfactory.concreteproducts.Luffy;
import desingpatterns.abstractfactory.concreteproducts.Nami;
import desingpatterns.abstractfactory.concreteproducts.Zoro;
import desingpatterns.abstractfactory.produtos.Capitao;
import desingpatterns.abstractfactory.produtos.Espadachim;
import desingpatterns.abstractfactory.produtos.Navegador;

public class TripulacaoLuffyFactory implements TripulacaoFactory {

    @Override
    public Capitao criarCapitao() {
        return new Luffy();
    }

    @Override
    public Espadachim criarEspadachim() {
        return new Zoro();
    }

    @Override
    public Navegador criarNavegador() {
        return new Nami();
    }
}
