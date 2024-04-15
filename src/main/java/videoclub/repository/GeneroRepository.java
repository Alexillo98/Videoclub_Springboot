package videoclub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import videoclub.entity.Genero;
@Component
public interface GeneroRepository extends CrudRepository<Genero,Long> {
}
