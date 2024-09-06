package diego.basili.u5_s1_l4.sevices;

import diego.basili.u5_s1_l4.entities.Pizza;
import diego.basili.u5_s1_l4.exceptions.NotFoundException;
import diego.basili.u5_s1_l4.repositories.PizzaRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaServices {
    @Autowired
    PizzaRepository pizzaRepository;

    public Pizza findById(long pizzaId) {
        Pizza pizza = pizzaRepository.findById(pizzaId)
                .orElseThrow(() -> new NotFoundException(pizzaId));
        Hibernate.initialize(pizza.getToppings());
        return pizza;
    }

}
