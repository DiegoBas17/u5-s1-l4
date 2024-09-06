package diego.basili.u5_s1_l4.repositories;

import diego.basili.u5_s1_l4.entities.Cibo;
import diego.basili.u5_s1_l4.sevices.CiboServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CiboRepository extends JpaRepository<Cibo, Long> {
}
