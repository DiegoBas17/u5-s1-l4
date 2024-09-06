package diego.basili.u5_s1_l4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@NoArgsConstructor
@Entity
public class Topping extends Cibo {
    private String name;
    @ManyToMany(mappedBy = "toppings")
    private List<Pizza> pizze = new ArrayList<>();

    public Topping(String name, Double price, int calorie) {
        super(price, calorie);
        this.name = name;
    }
}