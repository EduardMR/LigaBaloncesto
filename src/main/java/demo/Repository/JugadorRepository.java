package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
}
