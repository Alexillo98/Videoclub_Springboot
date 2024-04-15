package videoclub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import videoclub.entity.Pelicula;

import java.util.Optional;

@Component
public interface PeliculaRepository extends CrudRepository<Pelicula, Long> {
}
