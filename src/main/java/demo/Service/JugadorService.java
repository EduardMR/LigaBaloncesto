package demo.Service;

import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class JugadorService {

    @Autowired

    private JugadorRepository jugadorRepository;

    public void TestJ(){

        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Eduard");

        Calendar cal=Calendar.getInstance();
        cal.set(1991, Calendar.MARCH, 10);
        Date birthdate=cal.getTime();

        jugador1.setFechaNacimiento(birthdate);
        jugador1.setCanastasTotales(79);
        jugador1.setAsistenciasTotales(21);
        jugador1.setRebotesTotales(42);
        jugador1.setPosicion("base");

        jugadorRepository.save(jugador1);

        Jugador jugadorr = jugadorRepository.findOne(jugador1.getId());
        System.out.println(jugadorr);



        }



}
