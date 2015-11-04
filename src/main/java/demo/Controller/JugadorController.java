package demo.controller;

import demo.Exceptions.JugadorException;
import demo.Model.Jugador;
import demo.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by poo2 on 29/06/2015.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/jugadores")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> jugador = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugador.add(iterator.next());
        }

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){
            throw new JugadorException("El jugador con " + id + " no existe");}

        jugadorRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Jugador findById(@PathVariable Long id){
        Jugador jugador = jugadorRepository.findOne(id);

        if(jugador == null){
            throw new JugadorException("El jugador con " + id + " no existe");
        }
        return jugador;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador) {
        Jugador d1 = jugadorRepository.findOne(id);

        if(d1 == null){
            throw new JugadorException("El jugador con " + id + " no existe");
        }

        return jugadorRepository.save(jugador);
    }
}