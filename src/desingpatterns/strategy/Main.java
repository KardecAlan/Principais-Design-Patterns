package desingpatterns.strategy;

import desingpatterns.strategy.concreteStrategies.GearFive;
import desingpatterns.strategy.concreteStrategies.GearSecond;
import desingpatterns.strategy.concreteStrategies.SocoBasico;
import desingpatterns.strategy.context.Luffy;

public class Main {
    public static void main(String[] args) {

        Luffy luffy = new Luffy(new SocoBasico());
        luffy.atacar();

        luffy.setEstiloDeLuta(new GearSecond());
        luffy.atacar();

        luffy.setEstiloDeLuta(new GearFive());
        luffy.atacar();
    }
}
