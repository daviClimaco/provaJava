package davibc.provajava.repository;

import davibc.provajava.entity.Animal;
import org.hibernate.boot.internal.Extends;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}
