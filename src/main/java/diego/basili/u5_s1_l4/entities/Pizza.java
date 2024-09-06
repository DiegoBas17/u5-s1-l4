package diego.basili.u5_s1_l4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter

@NoArgsConstructor
@Entity
public class Pizza extends Cibo {
    private String name;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "pizza_topping", joinColumns = @JoinColumn(name = "pizza_id"), inverseJoinColumns = @JoinColumn(name = "topping_id"))
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double prezzo, int calorie) {
        super(prezzo, calorie);
        this.name = name;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
