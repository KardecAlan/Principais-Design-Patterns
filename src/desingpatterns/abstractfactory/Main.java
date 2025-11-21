package desingpatterns.abstractfactory;

import desingpatterns.abstractfactory.abstractfactory.TripulacaoFactory;
import desingpatterns.abstractfactory.concretefactories.TripulacaoBarbaBrancaFactory;
import desingpatterns.abstractfactory.concretefactories.TripulacaoLuffyFactory;
import desingpatterns.abstractfactory.produtos.Capitao;
import desingpatterns.abstractfactory.produtos.Espadachim;
import desingpatterns.abstractfactory.produtos.Navegador;

public class Main {
    public static void main(String[] args) {
        TripulacaoFactory tripulacaoFactory = new TripulacaoLuffyFactory();

        Capitao capitao = tripulacaoFactory.criarCapitao();
        Espadachim espadachim = tripulacaoFactory.criarEspadachim();
        Navegador navegador = tripulacaoFactory.criarNavegador();


        capitao.liderar();
        espadachim.lutar();
        navegador.navegar();

        TripulacaoBarbaBrancaFactory tripulacaoBarbaBrancaFactory = new TripulacaoBarbaBrancaFactory();

        Capitao capitaoBB = tripulacaoBarbaBrancaFactory.criarCapitao();
        Espadachim espadachimBB = tripulacaoBarbaBrancaFactory.criarEspadachim();
        Navegador navegadorBB = tripulacaoBarbaBrancaFactory.criarNavegador();

        capitaoBB.liderar();
        espadachimBB.lutar();
        navegadorBB.navegar();
    }
}
