package demo.Controller;

import demo.Exceptions.TemporadaExeption;
import demo.Model.Temporada;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by eduard.martinez on 04/11/2015.
 */
@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/temporada")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class TemporadaController {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Temporada save(@RequestBody Temporada jugador) {
        return temporadaRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Temporada> findAll() {
        List<Temporada> jugador = new ArrayList<Temporada>();
        Iterator<Temporada> iterator = temporadaRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugador.add(iterator.next());
        }

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Temporada jugador = temporadaRepository.findOne(id);

        if(jugador == null){
            throw new TemporadaExeption("El jugador con " + id + " no existe");}

        temporadaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Temporada findById(@PathVariable Long id){
        Temporada jugador = temporadaRepository.findOne(id);

        if(jugador == null){
            throw new TemporadaExeption("El jugador con " + id + " no existe");
        }
        return jugador;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Temporada updateById(@PathVariable Long id, @RequestBody Temporada jugador) {
        Temporada d1 = temporadaRepository.findOne(id);

        if(d1 == null){
            throw new TemporadaExeption("El jugador con " + id + " no existe");
        }

        return temporadaRepository.save(jugador);
    }
}

