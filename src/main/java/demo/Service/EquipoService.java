package demo.Service;


import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void TestE() {
        //Equipo 1------------------------------------------------------------------

        Equipo equipo1 = new Equipo();

        equipo1.setNombre("Barça");
        equipo1.setLocalidad("Barcelona");

        Calendar cal = Calendar.getInstance();
        cal.set(1960, Calendar.MARCH, 2);
        Date birthdate1 = cal.getTime();

        equipo1.setFechaCreacion(birthdate1);
        equipoRepository.save(equipo1);

        //Equipo 2------------------------------------------------------------------

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Madrid");
        equipo2.setLocalidad("Madrid");

        Calendar ca3 = Calendar.getInstance();
        ca3.set(1975, Calendar.APRIL, 2);
        Date birthdate2 = ca3.getTime();

        equipo2.setFechaCreacion(birthdate2);

        equipoRepository.save(equipo2);

        //Equipo 3------------------------------------------------------------------

        Equipo equipo3 = new Equipo();
        equipo3.setNombre("Sevilla");
        equipo3.setLocalidad("Sevilla");

        Calendar ca2 = Calendar.getInstance();
        ca2.set(1960, Calendar.JUNE, 25);
        Date birthdate3 = ca2.getTime();

        equipo3.setFechaCreacion(birthdate3);

        equipoRepository.save(equipo3);

        //Equipo 4------------------------------------------------------------------

        Equipo equipo4 = new Equipo();
        equipo4.setNombre("Malaga");
        equipo4.setLocalidad("Malaga");

        Calendar ca4 = Calendar.getInstance();
        ca4.set(1980, Calendar.MARCH, 26);
        Date birthdate4 = ca4.getTime();

        equipo4.setFechaCreacion(birthdate4);

        equipoRepository.save(equipo4);

        //Equipo 5------------------------------------------------------------------

        Equipo equipo5 = new Equipo();
        equipo5.setNombre("Gran Canaria");
        equipo5.setLocalidad("Gran Canaria");

        Calendar ca5 = Calendar.getInstance();
        ca5.set(1969, Calendar.JULY, 12);
        Date birthdate5 = ca5.getTime();

        equipo5.setFechaCreacion(birthdate5);

        equipoRepository.save(equipo5);
    }
}
