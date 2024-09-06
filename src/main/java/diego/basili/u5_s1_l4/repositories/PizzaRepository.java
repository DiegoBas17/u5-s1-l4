package diego.basili.u5_s1_l4.repositories;

import diego.basili.u5_s1_l4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {
}
