package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Eduard.martinez on 20/10/2015.

 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String año;

    @ManyToOne
    private Liga liga;

    @ManyToMany
    private Set<Equipo> equipos = new HashSet<>();

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", año='" + año + '\'' +
                '}';
    }
}
