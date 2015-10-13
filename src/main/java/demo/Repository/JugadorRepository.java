package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {





    public List<Jugador> findByNombreStartingWith(String nombre);
    public List<Jugador> findByCanastasTotalesGreaterThanEqual(Integer canastasTotales);
    public List<Jugador> findByAsistenciasTotalesBetween(Integer minAsistenciasTotales, Integer maxAsistenciasTotales);
    public List<Jugador> findByPosicionIs(String posicion);
    public List<Jugador> findByFechaNacimientoBefore(Date fechaNacimiento);
    public List<Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(Integer canastasTotales, Date fechaNacimiento);
}
