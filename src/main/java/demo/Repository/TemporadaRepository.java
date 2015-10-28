package demo.Repository;

import demo.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by eduard.martinez on 27/10/2015.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {

    Temporada findByAño(String añoTemporada);

}
