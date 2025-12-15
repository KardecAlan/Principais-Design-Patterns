package desingpatterns.decorator.decoratorabstrato;

import desingpatterns.decorator.interfacebase.Pirata;

public abstract class HabilidadeDecorator implements Pirata {

    protected Pirata pirata;

    public HabilidadeDecorator(Pirata pirata) {
        this.pirata = pirata;
    }
}
