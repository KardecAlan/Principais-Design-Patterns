package desingpatterns.observer.interfacesubject;

import desingpatterns.observer.Observer;

public interface Subject {

    void adicionarObserver(Observer o);
    void removerObserver(Observer o);
    void notificaObservers();
}
