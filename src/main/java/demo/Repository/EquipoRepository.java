package demo.Repository;


import demo.Model.Equipo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long> {

    Equipo findByNombre(String nombreEquipo);

}
