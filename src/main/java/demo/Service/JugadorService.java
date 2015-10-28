package demo.Service;

import demo.Model.Equipo;
import demo.Model.Jugador;
import demo.Model.Liga;
import demo.Repository.EquipoRepository;
import demo.Repository.JugadorRepository;
import demo.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class JugadorService {

    @Autowired
    EquipoRepository equipoRepository;
    @Autowired
    JugadorRepository jugadorRepository;

    //---------------------------------------JUGADOR SERVICE------------------------------------------------------------

    public void TestJ(){

    //----Jugador 1-----------------------------------------------------------------------------------------------------

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
        jugador1.setEquipo(equipoRepository.findByNombre("Barça"));

        jugadorRepository.save(jugador1);

    //----Jugador 2-----------------------------------------------------------------------------------------------------

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
        jugador2.setEquipo(equipoRepository.findByNombre("Barça"));

        jugadorRepository.save(jugador2);

    //----Jugador 3-----------------------------------------------------------------------------------------------------

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
        jugador3.setEquipo(equipoRepository.findByNombre("Barça"));

        jugadorRepository.save(jugador3);

    //----Jugador 4-----------------------------------------------------------------------------------------------------

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
        jugador4.setEquipo(equipoRepository.findByNombre("Barça"));

        jugadorRepository.save(jugador4);

    //----Jugador 5-----------------------------------------------------------------------------------------------------

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
        jugador5.setEquipo(equipoRepository.findByNombre("Barça"));

        jugadorRepository.save(jugador5);

        //----Jugador 6-----------------------------------------------------------------------------------------------------

        Jugador jugador6 = new Jugador();
        jugador6.setNombre("Mou");
        jugador6.setFechaNacimiento(birthdate);
        jugador6.setCanastasTotales(79);
        jugador6.setAsistenciasTotales(21);
        jugador6.setRebotesTotales(42);
        jugador6.setPosicion("pivot");
        jugador6.setEquipo(equipoRepository.findByNombre("Madrid"));

        jugadorRepository.save(jugador6);

//----Jugador7-----------------------------------------------------------------------------------------------------

        Jugador jugador7 = new Jugador();
        jugador7.setNombre("Abel");
        jugador7.setFechaNacimiento(birthdate);
        jugador7.setCanastasTotales(79);
        jugador7.setAsistenciasTotales(21);
        jugador7.setRebotesTotales(42);
        jugador7.setPosicion("pivot");
        jugador7.setEquipo(equipoRepository.findByNombre("Madrid"));

        jugadorRepository.save(jugador7);

//----Jugador8-----------------------------------------------------------------------------------------------------

        Jugador jugador8 = new Jugador();
        jugador8.setNombre("Cono");
        jugador8.setFechaNacimiento(birthdate);
        jugador8.setCanastasTotales(79);
        jugador8.setAsistenciasTotales(21);
        jugador8.setRebotesTotales(42);
        jugador8.setPosicion("pivot");
        jugador8.setEquipo(equipoRepository.findByNombre("Madrid"));

        jugadorRepository.save(jugador8);


//----Jugador9-----------------------------------------------------------------------------------------------------

        Jugador jugador9 = new Jugador();
        jugador9.setNombre("Cono");
        jugador9.setFechaNacimiento(birthdate);
        jugador9.setCanastasTotales(79);
        jugador9.setAsistenciasTotales(21);
        jugador9.setRebotesTotales(42);
        jugador9.setPosicion("pivot");
        jugador9.setEquipo(equipoRepository.findByNombre("Madrid"));

        jugadorRepository.save(jugador9);

//----Jugador10-----------------------------------------------------------------------------------------------------

        Jugador jugador10 = new Jugador();
        jugador10.setNombre("Cono");
        jugador10.setFechaNacimiento(birthdate);
        jugador10.setCanastasTotales(79);
        jugador10.setAsistenciasTotales(21);
        jugador10.setRebotesTotales(42);
        jugador10.setPosicion("pivot");
        jugador10.setEquipo(equipoRepository.findByNombre("Madrid"));

        jugadorRepository.save(jugador10);

//----Jugador11-----------------------------------------------------------------------------------------------------

        Jugador jugador11 = new Jugador();
        jugador11.setNombre("Cono");
        jugador11.setFechaNacimiento(birthdate);
        jugador11.setCanastasTotales(79);
        jugador11.setAsistenciasTotales(21);
        jugador11.setRebotesTotales(42);
        jugador11.setPosicion("pivot");
        jugador11.setEquipo(equipoRepository.findByNombre("Sevilla"));

        jugadorRepository.save(jugador11);

//----Jugador12-----------------------------------------------------------------------------------------------------

        Jugador jugador12 = new Jugador();
        jugador12.setNombre("Cono");
        jugador12.setFechaNacimiento(birthdate);
        jugador12.setCanastasTotales(79);
        jugador12.setAsistenciasTotales(21);
        jugador12.setRebotesTotales(42);
        jugador12.setPosicion("pivot");
        jugador12.setEquipo(equipoRepository.findByNombre("Sevilla"));

        jugadorRepository.save(jugador12);

//----Jugador13-----------------------------------------------------------------------------------------------------

        Jugador jugador13 = new Jugador();
        jugador13.setNombre("Cono");
        jugador13.setFechaNacimiento(birthdate);
        jugador13.setCanastasTotales(79);
        jugador13.setAsistenciasTotales(21);
        jugador13.setRebotesTotales(42);
        jugador13.setPosicion("pivot");
        jugador13.setEquipo(equipoRepository.findByNombre("Sevilla"));

        jugadorRepository.save(jugador13);

//----Jugador14-----------------------------------------------------------------------------------------------------

        Jugador jugador14 = new Jugador();
        jugador14.setNombre("Cono");
        jugador14.setFechaNacimiento(birthdate);
        jugador14.setCanastasTotales(79);
        jugador14.setAsistenciasTotales(21);
        jugador14.setRebotesTotales(42);
        jugador14.setPosicion("pivot");
        jugador14.setEquipo(equipoRepository.findByNombre("Sevilla"));

        jugadorRepository.save(jugador8);

//----Jugador15-----------------------------------------------------------------------------------------------------

        Jugador jugador15 = new Jugador();
        jugador15.setNombre("Cono");
        jugador15.setFechaNacimiento(birthdate);
        jugador15.setCanastasTotales(79);
        jugador15.setAsistenciasTotales(21);
        jugador15.setRebotesTotales(42);
        jugador15.setPosicion("pivot");
        jugador15.setEquipo(equipoRepository.findByNombre("Sevilla"));

        jugadorRepository.save(jugador15);

//----Jugador16-----------------------------------------------------------------------------------------------------

        Jugador jugador16 = new Jugador();
        jugador16.setNombre("Cono");
        jugador16.setFechaNacimiento(birthdate);
        jugador16.setCanastasTotales(79);
        jugador16.setAsistenciasTotales(21);
        jugador16.setRebotesTotales(42);
        jugador16.setPosicion("pivot");
        jugador16.setEquipo(equipoRepository.findByNombre("Malaga"));

        jugadorRepository.save(jugador16);

//----Jugador17-----------------------------------------------------------------------------------------------------

        Jugador jugador17 = new Jugador();
        jugador17.setNombre("Cono");
        jugador17.setFechaNacimiento(birthdate);
        jugador17.setCanastasTotales(79);
        jugador17.setAsistenciasTotales(21);
        jugador17.setRebotesTotales(42);
        jugador17.setPosicion("pivot");
        jugador17.setEquipo(equipoRepository.findByNombre("Malaga"));

        jugadorRepository.save(jugador17);

//----Jugador18-----------------------------------------------------------------------------------------------------

        Jugador jugador18 = new Jugador();
        jugador18.setNombre("Cono");
        jugador18.setFechaNacimiento(birthdate);
        jugador18.setCanastasTotales(79);
        jugador18.setAsistenciasTotales(21);
        jugador18.setRebotesTotales(42);
        jugador18.setPosicion("pivot");
        jugador18.setEquipo(equipoRepository.findByNombre("Malaga"));

        jugadorRepository.save(jugador18);

//----Jugador19-----------------------------------------------------------------------------------------------------

        Jugador jugador19 = new Jugador();
        jugador19.setNombre("Cono");
        jugador19.setFechaNacimiento(birthdate);
        jugador19.setCanastasTotales(79);
        jugador19.setAsistenciasTotales(21);
        jugador19.setRebotesTotales(42);
        jugador19.setPosicion("pivot");
        jugador19.setEquipo(equipoRepository.findByNombre("Malaga"));

        jugadorRepository.save(jugador19);

//----Jugador20-----------------------------------------------------------------------------------------------------

        Jugador jugador20 = new Jugador();
        jugador20.setNombre("Cono");
        jugador20.setFechaNacimiento(birthdate);
        jugador20.setCanastasTotales(79);
        jugador20.setAsistenciasTotales(21);
        jugador20.setRebotesTotales(42);
        jugador20.setPosicion("pivot");
        jugador20.setEquipo(equipoRepository.findByNombre("Malaga"));

        jugadorRepository.save(jugador20);

//----Jugador21-----------------------------------------------------------------------------------------------------

        Jugador jugador21 = new Jugador();
        jugador21.setNombre("Cono");
        jugador21.setFechaNacimiento(birthdate);
        jugador21.setCanastasTotales(79);
        jugador21.setAsistenciasTotales(21);
        jugador21.setRebotesTotales(42);
        jugador21.setPosicion("pivot");
        jugador21.setEquipo(equipoRepository.findByNombre("Gran Canaria"));

        jugadorRepository.save(jugador21);

//----Jugador22-----------------------------------------------------------------------------------------------------

        Jugador jugador22 = new Jugador();
        jugador22.setNombre("Cono");
        jugador22.setFechaNacimiento(birthdate);
        jugador22.setCanastasTotales(79);
        jugador22.setAsistenciasTotales(21);
        jugador22.setRebotesTotales(42);
        jugador22.setPosicion("pivot");
        jugador22.setEquipo(equipoRepository.findByNombre("Gran Canaria"));

        jugadorRepository.save(jugador22);

//----Jugador23-----------------------------------------------------------------------------------------------------

        Jugador jugador23 = new Jugador();
        jugador23.setNombre("Cono");
        jugador23.setFechaNacimiento(birthdate);
        jugador23.setCanastasTotales(79);
        jugador23.setAsistenciasTotales(21);
        jugador23.setRebotesTotales(42);
        jugador23.setPosicion("pivot");
        jugador23.setEquipo(equipoRepository.findByNombre("Gran Canaria"));

        jugadorRepository.save(jugador23);

//----Jugador24-----------------------------------------------------------------------------------------------------

        Jugador jugador24 = new Jugador();
        jugador24.setNombre("Cono");
        jugador24.setFechaNacimiento(birthdate);
        jugador24.setCanastasTotales(79);
        jugador24.setAsistenciasTotales(21);
        jugador24.setRebotesTotales(42);
        jugador24.setPosicion("pivot");
        jugador24.setEquipo(equipoRepository.findByNombre("Gran Canaria"));

        jugadorRepository.save(jugador24);

//----Jugador25-----------------------------------------------------------------------------------------------------

        Jugador jugador25 = new Jugador();
        jugador25.setNombre("Cono");
        jugador25.setFechaNacimiento(birthdate);
        jugador25.setCanastasTotales(79);
        jugador25.setAsistenciasTotales(21);
        jugador25.setRebotesTotales(42);
        jugador25.setPosicion("pivot");
        jugador25.setEquipo(equipoRepository.findByNombre("Gran Canaria"));

        jugadorRepository.save(jugador25);




        //System.out.println(jugadorRepository.findOne(jugador1.getId()));
        //System.out.println(jugadorRepository.findByNombreStartingWith("E"));
        //System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqual(50));
        //System.out.println(jugadorRepository.findByAsistenciasTotalesBetween(20, 50));
        //System.out.println(jugadorRepository.findByPosicionIs("base"));
        //System.out.println(jugadorRepository.findByFechaNacimientoBefore(cal.getTime()));
        //System.out.println(jugadorRepository.findByCanastasTotalesGreaterThanEqualAndFechaNacimientoBefore(55,cal.getTime()));


        }
    }
