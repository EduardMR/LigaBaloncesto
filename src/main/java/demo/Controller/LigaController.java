package demo.Controller;

import demo.Exceptions.LigaExeption;
import demo.Model.Liga;
import demo.Repository.LigaRepository;
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
@RequestMapping("/liga")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class LigaController {


    @Autowired
    private LigaRepository ligaRepository;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Liga save(@RequestBody Liga jugador) {
        return ligaRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Liga> findAll() {
        List<Liga> jugador = new ArrayList<Liga>();
        Iterator<Liga> iterator = ligaRepository.findAll().iterator();

        while (iterator.hasNext()) {
            jugador.add(iterator.next());
        }

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Liga jugador = ligaRepository.findOne(id);

        if(jugador == null){
            throw new LigaExeption("El jugador con " + id + " no existe");}

        ligaRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Liga findById(@PathVariable Long id){
        Liga jugador = ligaRepository.findOne(id);

        if(jugador == null){
            throw new LigaExeption("El jugador con " + id + " no existe");
        }
        return jugador;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Liga updateById(@PathVariable Long id, @RequestBody Liga jugador) {
        Liga d1 = ligaRepository.findOne(id);

        if(d1 == null){
            throw new LigaExeption("El jugador con " + id + " no existe");
        }

        return ligaRepository.save(jugador);
    }
}
