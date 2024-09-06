package diego.basili.u5_s1_l4.entities;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Drinks extends Cibo {
    private String name;
    private Double litri;

    public Drinks(String name, Double price, int calorie, Double litri) {
        super(price, calorie);
        this.litri = litri;
        this.name = name;
    }


}
