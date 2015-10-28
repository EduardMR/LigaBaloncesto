package demo.Service;


import demo.Model.Equipo;
import demo.Model.Temporada;
import demo.Repository.EquipoRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

//--------------------------EQUIPOS SERVICE-------------------------------------------------------------------------


@Service
@Transactional
public class EquipoService {

    @Autowired
    TemporadaRepository temporadaRepository;
    @Autowired
    EquipoRepository equipoRepository;

    public void TestE() {

        //Equipo 1------------------------------------------------------------------------------------------------------

        Equipo barça = new Equipo();

        barça.setNombre("Barça");
        barça.setLocalidad("Barcelona");

        Calendar cal = Calendar.getInstance();
        cal.set(1960, Calendar.MARCH, 2);
        Date birthdate1 = cal.getTime();

        Temporada temporada = temporadaRepository.findByAño("14-15");
        barça.setFechaCreacion(birthdate1);


        equipoRepository.save(barça);

        temporada.getEquipos().add(barça);

        temporadaRepository.save(temporada);

        //Equipo 2------------------------------------------------------------------------------------------------------

        Equipo madrid = new Equipo();
        madrid.setNombre("Madrid");
        madrid.setLocalidad("Madrid");

        Calendar ca3 = Calendar.getInstance();
        ca3.set(1975, Calendar.APRIL, 2);
        Date birthdate2 = ca3.getTime();

        madrid.setFechaCreacion(birthdate2);

        equipoRepository.save(madrid);

        //Equipo 3------------------------------------------------------------------------------------------------------

        Equipo sevilla = new Equipo();
        sevilla.setNombre("Sevilla");
        sevilla.setLocalidad("Sevilla");

        Calendar ca2 = Calendar.getInstance();
        ca2.set(1960, Calendar.JUNE, 25);
        Date birthdate3 = ca2.getTime();

        sevilla.setFechaCreacion(birthdate3);

        equipoRepository.save(sevilla);

        //Equipo 4------------------------------------------------------------------------------------------------------

        Equipo malaga = new Equipo();
        malaga.setNombre("Malaga");
        malaga.setLocalidad("Malaga");

        Calendar ca4 = Calendar.getInstance();
        ca4.set(1980, Calendar.MARCH, 26);
        Date birthdate4 = ca4.getTime();

        malaga.setFechaCreacion(birthdate4);

        equipoRepository.save(malaga);

        //Equipo 5------------------------------------------------------------------------------------------------------

        Equipo granCanaria = new Equipo();
        granCanaria.setNombre("Gran Canaria");
        granCanaria.setLocalidad("Gran Canaria");

        Calendar ca5 = Calendar.getInstance();
        ca5.set(1969, Calendar.JULY, 12);
        Date birthdate5 = ca5.getTime();

        granCanaria.setFechaCreacion(birthdate5);

        equipoRepository.save(granCanaria);
    }
}

