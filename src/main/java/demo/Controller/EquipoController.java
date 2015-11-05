package demo.Controller;

import demo.Exceptions.EquipoExeption;
import demo.Model.Equipo;
import demo.Repository.EquipoRepository;
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
    @RequestMapping("/equipo")
public class EquipoController {
    @Autowired
    private EquipoRepository equipoRepository;


    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Equipo save(@RequestBody Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Equipo> findAll() {
        List<Equipo> equipo = new ArrayList<Equipo>();
        Iterator<Equipo> iterator = equipoRepository.findAll().iterator();

        while (iterator.hasNext()) {
            equipo.add(iterator.next());
        }

        return equipo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findOne(id);

        if(equipo == null){
            throw new EquipoExeption("El equipo con " + id + " no existe");}

        equipoRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Equipo findById(@PathVariable Long id){
        Equipo equipo = equipoRepository.findOne(id);

        if(equipo == null){
            throw new EquipoExeption("El equipo con " + id + " no existe");
        }
        return equipo;
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo equipo) {
        Equipo d1 = equipoRepository.findOne(id);

        if(d1 == null){
            throw new EquipoExeption("El equipo con " + id + " no existe");
        }

        return equipoRepository.save(equipo);
    }
}

