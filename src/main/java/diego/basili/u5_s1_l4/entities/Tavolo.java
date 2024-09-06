package diego.basili.u5_s1_l4.entities;

import diego.basili.u5_s1_l4.enums.StatoTavolo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tavolo {
    private int numeroTavolo;
    private int numeroCopertiMassimo;
    private StatoTavolo statoTavolo;

    public Tavolo(int numeroTavolo, int numeroCopertiMassimo) {
        this.numeroTavolo = numeroTavolo;
        this.numeroCopertiMassimo = numeroCopertiMassimo;
        this.statoTavolo = StatoTavolo.LIBERO;
    }
}