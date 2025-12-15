package desingpatterns.strategy.concreteStrategies;

import desingpatterns.strategy.strategy.EstiloDeLuta;

public class GearFive implements EstiloDeLuta {
    @Override
    public void atacar() {
        IO.println("Luffy ativa Gear Five: Forma livre , modo deus NIKA!");
    }
}
