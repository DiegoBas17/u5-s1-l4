package diego.basili.u5_s1_l4;


import diego.basili.u5_s1_l4.entities.*;
import diego.basili.u5_s1_l4.enums.StatoOrdine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.time.LocalDateTime;

@PropertySource("application.properties")
@Configuration
public class MenuConfig {

    @Bean
    public Topping pomodoro () {
        return new Topping("Pomodoro", 1.0, 10);
    }

    @Bean
    public Topping mozzarella () {
        return new Topping("Mozzarella", 1.0, 50);
    }

    @Bean
    public Topping prosciutto () {
        return new Topping("Prosciutto", 1.5, 40);
    }

    @Bean
    public Topping ananas () {
        return new Topping("Ananas", 3.0, 20);
    }

    @Bean
    public Topping salame () {
        return new Topping("Salame", 1.5, 100);
    }

    @Bean
    public Pizza margherita () {
        Pizza margherita = new Pizza("Margherita", 7.5, 300);
        margherita.addTopping(pomodoro());
        margherita.addTopping(mozzarella());
        return margherita;
    }

    @Bean
    public Pizza margheritaXL () {
        Pizza margherita = new Pizza("Margherita XL", 12.5, 300);
        margherita.addTopping(pomodoro());
        margherita.addTopping(mozzarella());
        return margherita;
    }

    @Bean
    public Pizza hawaiana () {
        Pizza hawaiana = new Pizza("Hawaiana", 15.5, 250);
        hawaiana.addTopping(pomodoro());
        hawaiana.addTopping(mozzarella());
        hawaiana.addTopping(prosciutto());
        hawaiana.addTopping(ananas());
        return hawaiana;
    }

    @Bean
    public Pizza hawaianaXL () {
        Pizza hawaiana = new Pizza("Hawaiana XL", 20.5, 250);
        hawaiana.addTopping(pomodoro());
        hawaiana.addTopping(mozzarella());
        hawaiana.addTopping(prosciutto());
        hawaiana.addTopping(ananas());
        return hawaiana;
    }

    @Bean
    public Pizza salamella () {
        Pizza salamella = new Pizza("Salamella", 9.5, 350);
        salamella.addTopping(pomodoro());
        salamella.addTopping(mozzarella());
        salamella.addTopping(salame());
        return salamella;
    }

    @Bean
    public Pizza salamellaXL () {
        Pizza salamella = new Pizza("Salamella XL", 18.5, 350);
        salamella.addTopping(pomodoro());
        salamella.addTopping(mozzarella());
        salamella.addTopping(salame());
        return salamella;
    }

    @Bean
    public Drinks limonata () {
        return new Drinks("Limonata", 3.0, 100, 0.4);
    }

    @Bean
    public Drinks acqua () {
        return new Drinks("Acqua", 1.0, 0, 0.5);
    }

    @Bean
    public Drinks cola () {
        return new Drinks("Cola", 2.5, 200, 0.33);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addElemento(margherita());
        menu.addElemento(margheritaXL());
        menu.addElemento(hawaiana());
        menu.addElemento(hawaianaXL());
        menu.addElemento(salamella());
        menu.addElemento(salamellaXL());
        menu.addElemento(pomodoro());
        menu.addElemento(mozzarella());
        menu.addElemento(prosciutto());
        menu.addElemento(ananas());
        menu.addElemento(salame());
        menu.addElemento(limonata());
        menu.addElemento(cola());
        menu.addElemento(acqua());
        return menu;
    }

    @Bean
    public Ordine ordine () {
        Ordine ordine = new Ordine(1, StatoOrdine.IN_CORSO, tavolox2().getNumeroCopertiMassimo(), LocalDateTime.now(), tavolox2().getNumeroTavolo());
        ordine.addElementoComanda(menu().getElementiMenu().get(0));
        ordine.addElementoComanda(menu().getElementiMenu().get(2));
        return ordine;
    }

    @Bean
    public Tavolo tavolox6 () {
        return new Tavolo(1, 6);
    }
    @Bean
    public Tavolo tavolox2 () {
        return new Tavolo(1, 2);
    }
    @Bean
    public Tavolo tavolox4 () {
        return new Tavolo(1, 4);
    }
}
