package desingpatterns.decorator.classeconcreta;

import desingpatterns.decorator.interfacebase.Pirata;

public class Luffy implements Pirata {
    @Override
    public String atacar() {
        return "Soco do Luffy";
    }

    @Override
    public int poder() {
        return 100;
    }
}
