package desingpatterns.abstractfactory.concretefactories;

import desingpatterns.abstractfactory.abstractfactory.TripulacaoFactory;
import desingpatterns.abstractfactory.concreteproducts.BarbaBranca;
import desingpatterns.abstractfactory.concreteproducts.Marco;
import desingpatterns.abstractfactory.concreteproducts.Vista;
import desingpatterns.abstractfactory.produtos.Capitao;
import desingpatterns.abstractfactory.produtos.Espadachim;
import desingpatterns.abstractfactory.produtos.Navegador;

public class TripulacaoBarbaBrancaFactory implements TripulacaoFactory {
    @Override
    public Capitao criarCapitao() {
        return new BarbaBranca();
    }

    @Override
    public Espadachim criarEspadachim() {
        return new Vista();
    }

    @Override
    public Navegador criarNavegador() {
        return new Marco();
    }
}
