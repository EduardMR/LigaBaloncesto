package demo.Repository;

import demo.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Eduard.martinez on 20/10/2015.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long> {

    Liga findByNombre(String nombreLiga);




}
