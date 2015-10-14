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
        cal.set(1989, Calendar.MARCH, 1);
        Date birthdate=cal.getTime();

        jugador1.setFechaNacimiento(birthdate);
        jugador1.setCanastasTotales(79);
        jugador1.setAsistenciasTotales(21);
        jugador1.setRebotesTotales(42);
        jugador1.setPosicion("pivot");

        jugadorRepository.save(jugador1);

        Jugador jugador2 = new Jugador();
        jugador2.setNombre("David");

        Calendar ca2=Calendar.getInstance();
        cal.set(1997, Calendar.MARCH, 2);
        Date birthdate2=cal.getTime();

        jugador2.setFechaNacimiento(birthdate2);
        jugador2.setCanastasTotales(53);
        jugador2.setAsistenciasTotales(24);
        jugador2.setRebotesTotales(35);
        jugador2.setPosicion("alero");

        jugadorRepository.save(jugador2);

        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Marc");

        Calendar ca3=Calendar.getInstance();
        cal.set(1963, Calendar.MARCH, 23);
        Date birthdate3=cal.getTime();

        jugador3.setFechaNacimiento(birthdate);
        jugador3.setCanastasTotales(41);
        jugador3.setAsistenciasTotales(52);
        jugador3.setRebotesTotales(63);
        jugador3.setPosicion("base");

        jugadorRepository.save(jugador3);


        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Eustaquio");

        Calendar ca4=Calendar.getInstance();
        cal.set(1991, Calendar.MARCH, 10);
        Date birthdate4=cal.getTime();

        jugador4.setFechaNacimiento(birthdate4);
        jugador4.setCanastasTotales(73);
        jugador4.setAsistenciasTotales(54);
        jugador4.setRebotesTotales(56);
        jugador4.setPosicion("defensa");

        jugadorRepository.save(jugador4);


        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Marco");

        Calendar ca5=Calendar.getInstance();
        cal.set(1991, Calendar.MARCH, 5);
        Date birthdate5=cal.getTime();

        jugador5.setFechaNacimiento(birthdate5);
        jugador5.setCanastasTotales(65);
        jugador5.setAsistenciasTotales(32);
        jugador5.setRebotesTotales(21);
        jugador5.setPosicion("medio");

        jugadorRepository.save(jugador5);























        System.out.println(jugadorRepository.findOne(jugador1.getId()));

        System.out.println(jugadorRepository.findByNombreStartingWith("E"));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(50));
        System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(20, 50));
        System.out.println(jugadorRepository.findByPosicionIs("base"));
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(cal.getTime()));
        System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(55,cal.getTime()));


        }



}
