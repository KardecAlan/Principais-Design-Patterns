package desingpatterns.observer.observersconcretos;

import desingpatterns.observer.Observer;
import desingpatterns.observer.Recompensa;

public class LuffyObserver implements Observer {

    @Override
    public void atualizar(Recompensa recompensa) {
        if ("Luffy".equalsIgnoreCase(recompensa.getNomePirata())) {
            System.out.println("[Luffy] Uau! Minha nova recompensa é "
                    + recompensa.getValor() + " Berries! SHISHISHI!");
        } else {
            System.out.println("[Luffy] Nem liguei pra recompensa de "
                    + recompensa.getNomePirata() + "...");
        }
    }
}
