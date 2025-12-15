package desingpatterns.decorator.decoratorconcreto;

import desingpatterns.decorator.decoratorabstrato.HabilidadeDecorator;
import desingpatterns.decorator.interfacebase.Pirata;

public class GearSecond extends HabilidadeDecorator {

    public GearSecond(Pirata pirata) {
        super(pirata);
    }

    @Override
    public String atacar() {
        return pirata.atacar() + " com Gear Second";
    }

    @Override
    public int poder() {
        return pirata.poder() + 50;
    }
}
