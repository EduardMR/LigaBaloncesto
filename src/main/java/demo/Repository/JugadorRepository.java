package demo.Repository;

import demo.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {


    //-----I------------------------------------------------------------------------------------------------------------

    @Query("select j from Jugador j where j.equipo.nombre=:nombreEquipo")
    List<Jugador> findByNombreEquipo(@Param("nombreEquipo") String nombreEquipo);

    //-----II-----------------------------------------------------------------------------------------------------------

    @Query("select j from Jugador j where j.posicion=:posicionCampo and j.equipo.nombre=:nombreEquipo")
    List<Jugador> findJugadoresByposicionfromEquipo(@Param("posicionCampo")
                  String posicionCampo, @Param("nombreEquipo") String nombreEquipo);

    //-----III----------------------------------------------------------------------------------------------------------

    @Query("select j from Jugador j  order by j.canastasTotales desc")
    List<Jugador> findCanastasOrderByCanastaTotales();


    //-----IV-----------------------------------------------------------------------------------------------------------

    @Query("select  j from Jugador j order by j.asistenciasTotales desc ")
    List<Jugador> findByAsistenciasOrderBy();

    //-----V------------------------------------------------------------------------------------------------------------

    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :nombreEquipo order by j.canastasTotales desc ")
    List<Jugador> findCanastasOrderByCanastasTotales(@Param("nombreEquipo") String nombre);




    //public List<Jugador> findByNombreStartingWith(String nombre);
    //public List<Jugador> findByCanastasTotalesGreaterThanEqual(Integer canastasTotales);
    //public List<Jugador> findByAsistenciasTotalesBetween(Integer minAsistenciasTotales, Integer maxAsistenciasTotales);
    //public List<Jugador> findByPosicionIs(String posicion);
    //public List<Jugador> findByFechaNacimientoBefore(Date fechaNacimiento);
    //public List<Jugador> findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(Integer canastasTotales, Date fechaNacimiento);
}
