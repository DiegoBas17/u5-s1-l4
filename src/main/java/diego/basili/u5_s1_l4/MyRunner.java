package diego.basili.u5_s1_l4;

import diego.basili.u5_s1_l4.entities.*;
import diego.basili.u5_s1_l4.exceptions.NotFoundException;
import diego.basili.u5_s1_l4.exceptions.ValidationException;
import diego.basili.u5_s1_l4.sevices.CiboServices;
import diego.basili.u5_s1_l4.sevices.PizzaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private Menu menu;
    @Autowired
    private Ordine ordine;
    @Autowired
    private CiboServices ciboServices;
    @Autowired
    private Topping pomodoro;
    @Autowired
    private Topping mozzarella;
    @Autowired
    private Topping prosciutto;
    @Autowired
    private Topping ananas;
    @Autowired
    private Topping salame;
    @Autowired
    private Pizza margherita;
    @Autowired
    private Pizza hawaiana;
    @Autowired
    private Pizza salamella;
    @Autowired
    private Drinks limonata;
    @Autowired
    private Drinks acqua;
    @Autowired
    private Drinks cola;
    @Autowired
    private PizzaServices pizzaServices;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("inizio run");
        menu.stampaMenu();

        System.out.println(ordine);
        System.out.println("il conto del tavolo numero " + ordine.getNumeroTavolo()+ " è: €"  +ordine.conto());

        try {
            ciboServices.saveCibo(pomodoro);
            ciboServices.saveCibo(mozzarella);
            ciboServices.saveCibo(prosciutto);
            ciboServices.saveCibo(ananas);
            ciboServices.saveCibo(salame);
            ciboServices.saveCibo(margherita);
            ciboServices.saveCibo(hawaiana);
            ciboServices.saveCibo(salamella);
            ciboServices.saveCibo(limonata);
            ciboServices.saveCibo(acqua);
            ciboServices.saveCibo(cola);
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pizzaServices.findById(57));
        } catch (NotFoundException ex) {
            System.out.println(ex.getMessage());
        }



        System.out.println("fine run");
    }
}
