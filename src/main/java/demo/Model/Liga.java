package demo.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by eduard.martinez on 14/10/2015.
 */

@Entity
public class Liga {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    @OneToMany
    private Set<Temporada> temporadas = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", temporadas=" + temporadas +
                '}';
    }
}
