package demo.Service;

import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Eduard.martinez on 20/10/2015.
 */

@Service
@Transactional
public class LigaService {
    //-----------------------------------------------LIGA SERVICE-------------------------------------------------------
    @Autowired
    LigaRepository ligaRepository;
    @Autowired
    TemporadaRepository temporadaRepository;

    public void TestL() {

    //Liga ACB----------------------------------------------------------------------------------------------------------

        Liga ACB = new Liga();
        ACB.setNombre("ACB");
        ligaRepository.save(ACB);

        //temporada 14-15---------------------------------------------------------------------------------------------------

        Temporada temporada1 = new Temporada();
        temporada1.setAño("14-15");
        temporada1.setLiga(ligaRepository.findByNombre("ACB"));
        temporadaRepository.save(temporada1);


    }

   

}
