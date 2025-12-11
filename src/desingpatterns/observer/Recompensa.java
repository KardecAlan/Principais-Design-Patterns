package desingpatterns.observer;

import java.math.BigDecimal;

public class Recompensa {

    private final String nomePirata;
    private final String valor;

    public Recompensa(String nomePirata, String valor) {
        this.nomePirata = nomePirata;
        this.valor = valor;
    }

    public String getNomePirata() {
        return nomePirata;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Recompensa de " + nomePirata + " = " + valor + " Berries";
    }
}
