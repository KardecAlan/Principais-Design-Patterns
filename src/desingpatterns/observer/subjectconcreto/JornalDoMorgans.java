package desingpatterns.observer.subjectconcreto;

import desingpatterns.observer.Observer;
import desingpatterns.observer.Recompensa;
import desingpatterns.observer.interfacesubject.Subject;

import java.util.ArrayList;
import java.util.List;

public class JornalDoMorgans implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private Recompensa ultimaRecompensa;


    @Override
    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removerObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notificaObservers() {
        for (Observer o : observers) {
            o.atualizar(ultimaRecompensa);
        }
    }

    public void publicarNovaRecompensa(Recompensa recompensa) {
        System.out.println("\n[JORNAL DO MORGANS] Nova notícia: " + recompensa);
        this.ultimaRecompensa = recompensa;
        notificaObservers();
    }
}
