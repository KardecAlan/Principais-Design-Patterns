package desingpatterns.strategy.concreteStrategies;

import desingpatterns.strategy.strategy.EstiloDeLuta;

public class GearSecond implements EstiloDeLuta {

    @Override
    public void atacar() {
        IO.println("Luffy ativa Gear Second: Aceleração do Sangue!");
    }
}
