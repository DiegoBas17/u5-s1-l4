package diego.basili.u5_s1_l4.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Cibo> elementiMenu;

    public Menu() {
        this.elementiMenu = new ArrayList<>();
    }

    public void addElemento(Cibo elemento){
        elementiMenu.add(elemento);
    }

    public void stampaMenu() {
        elementiMenu.forEach(System.out::println);
    }

    public List<Cibo> getElementiMenu() {
        return elementiMenu;
    }

    public void setElementiMenu(List<Cibo> elementiMenu) {
        this.elementiMenu = elementiMenu;
    }
}
