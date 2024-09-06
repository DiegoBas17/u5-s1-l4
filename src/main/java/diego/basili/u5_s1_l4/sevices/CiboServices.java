package diego.basili.u5_s1_l4.sevices;

import diego.basili.u5_s1_l4.entities.Cibo;
import diego.basili.u5_s1_l4.entities.Drinks;
import diego.basili.u5_s1_l4.entities.Pizza;
import diego.basili.u5_s1_l4.entities.Topping;
import diego.basili.u5_s1_l4.exceptions.ValidationException;
import diego.basili.u5_s1_l4.repositories.CiboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CiboServices {
    @Autowired
    CiboRepository ciboRepository;

    public void saveCibo(Cibo newCibo) {
        if (newCibo instanceof Pizza) {
            Pizza pizza = (Pizza) newCibo;
            if (pizza.getName() == null || pizza.getName().length() <2) {
                throw new ValidationException("Il nome della pizza non può essere cosi corto.");
            }
        } else if (newCibo instanceof Topping) {
            Topping topping = (Topping) newCibo;
            if (topping.getName() == null || topping.getName().length() <2) {
                throw new ValidationException("Il nome del topping non può essere cosi corto.");
            }
        } else if (newCibo instanceof Drinks) {
            Drinks drinks = (Drinks) newCibo;
            if (drinks.getName() == null || drinks.getName().length() <2) {
                throw new ValidationException("Il nome della bevanda non può essere cosi corto.");
            }
        }
        ciboRepository.save(newCibo);
        System.out.println("elemento salvato con successo");
    }

}
