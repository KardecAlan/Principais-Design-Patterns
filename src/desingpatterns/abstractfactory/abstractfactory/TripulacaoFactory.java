package desingpatterns.abstractfactory.abstractfactory;

import desingpatterns.abstractfactory.produtos.Capitao;
import desingpatterns.abstractfactory.produtos.Espadachim;
import desingpatterns.abstractfactory.produtos.Navegador;

public interface TripulacaoFactory {

    Capitao criarCapitao();
    Espadachim criarEspadachim();
    Navegador criarNavegador();

}
