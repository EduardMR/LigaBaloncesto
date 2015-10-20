package demo.Service;

import demo.Model.Liga;
import demo.Repository.LigaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Eduard.martinez on 20/10/2015.
 */

@Service
@Transactional
public class LigaService {
    //-----------------------------------------------LIGA SERVICE-------------------------------------------------------

    public void TestL() {

    //Liga ACB----------------------------------------------------------------------------------------------------------

        Liga liga1 = new Liga();
        liga1.setNombre("ACB");


    }



}
