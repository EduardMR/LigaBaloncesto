package demo.Service;

import demo.Model.Liga;
import demo.Model.Temporada;
import demo.Repository.LigaRepository;
import demo.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by eduard.martinez on 27/10/2015.
 */


public class TemporadaService {
    @Autowired
    LigaRepository ligaRepository;

}
