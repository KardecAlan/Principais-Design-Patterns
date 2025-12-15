package desingpatterns.strategy.concreteStrategies;

import desingpatterns.strategy.strategy.EstiloDeLuta;

public class SocoBasico implements EstiloDeLuta {

    @Override
    public void atacar() {
        IO.println("Luffy usa Soco Basico!");
    }
}
