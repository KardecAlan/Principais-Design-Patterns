package desingpatterns.observer.observersconcretos;

import desingpatterns.observer.Observer;
import desingpatterns.observer.Recompensa;

public class MarinhaObserver implements Observer {

    @Override
    public void atualizar(Recompensa recompensa) {
        System.out.println("[Marinha] Registrando nova recompensa: "
                + recompensa + ". Vamos reforçar a vigilância!");
    }
}
