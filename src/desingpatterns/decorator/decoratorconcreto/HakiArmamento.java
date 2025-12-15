package desingpatterns.decorator.decoratorconcreto;

import desingpatterns.decorator.decoratorabstrato.HabilidadeDecorator;
import desingpatterns.decorator.interfacebase.Pirata;

public class HakiArmamento extends HabilidadeDecorator {

    public HakiArmamento(Pirata pirata) {
        super(pirata);
    }

    @Override
    public String atacar() {
        return pirata.atacar() + " com Haki de Armamento";
    }

    @Override
    public int poder() {
        return pirata.poder() + 70;
    }
}
