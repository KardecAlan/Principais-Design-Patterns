package desingpatterns.observer;

import desingpatterns.observer.observersconcretos.LuffyObserver;
import desingpatterns.observer.observersconcretos.MarinhaObserver;
import desingpatterns.observer.subjectconcreto.JornalDoMorgans;

public class Publicacao {
    public static void main(String[] args) {
        JornalDoMorgans jornal = new JornalDoMorgans();

        Observer luffy = new LuffyObserver();
        Observer marinha = new MarinhaObserver();

        //Seria com se esperando o jornal
        jornal.adicionarObserver(luffy);
        jornal.adicionarObserver(marinha);

        //Sai uma nova recompensa pro Luffy
        Recompensa recompensaLuffy = new Recompensa("Luffy", "3.000.000.000");
        jornal.publicarNovaRecompensa(recompensaLuffy);



    }
}
