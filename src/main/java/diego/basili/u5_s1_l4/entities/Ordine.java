package diego.basili.u5_s1_l4.entities;

import diego.basili.u5_s1_l4.enums.StatoOrdine;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@PropertySource("application.properties")
@Getter
@Setter
@ToString
public class Ordine {
    private int numeroOrdine;
    private List<Cibo> comanda;
    private StatoOrdine statoOrdine;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private int numeroTavolo;
    @Value("${costo.coperto}")
    private double costoCoperto;

    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, int numeroCoperti, LocalDateTime oraAcquisizione, int numeroTavolo) {
        this.numeroOrdine = numeroOrdine;
        this.comanda = new ArrayList<>();
        this.statoOrdine = StatoOrdine.IN_CORSO;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.numeroTavolo = numeroTavolo;
    }

    public Ordine(int numeroOrdine, List<Cibo> comanda, StatoOrdine statoOrdine, LocalDateTime oraAcquisizione, int numeroCoperti, int numeroTavolo, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.comanda = comanda;
        this.statoOrdine = statoOrdine;
        this.oraAcquisizione = oraAcquisizione;
        this.numeroCoperti = numeroCoperti;
        this.numeroTavolo = numeroTavolo;
        this.costoCoperto = costoCoperto;
    }

    public void addElementoComanda(Cibo cibo) {
        comanda.add(cibo);
    }


    public Double conto() {
        double toteleComanda = comanda.stream().mapToDouble(Cibo::getPrice).sum();
        double totaleCoperto = numeroCoperti * costoCoperto;
        return toteleComanda + totaleCoperto;
    }

}