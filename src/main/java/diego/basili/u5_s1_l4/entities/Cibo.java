package diego.basili.u5_s1_l4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Cibo {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    protected long id;
    protected Double price;
    protected int calorie;

    public Cibo(Double price, int calorie) {
        this.price = price;
        this.calorie = calorie;
    }

}