package demo.Model;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //un identificador, un nombre, una fecha de nacimiento, un número de canastas totales, un número de asistencias totales,
    // un número de rebotes totales y una posición en el campo por defecto

    private String nombre;
    private Date fechaNacimiento;
    private Integer canastasTotales;
    private Integer asistenciasTotales;
    private Integer rebotesTotales;
    private String posicion;

    @ManyToOne
    private Equipo equipo;

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public Integer getCanastasTotales() {
        return canastasTotales;
    }

    public Integer getAsistenciasTotales() {
        return asistenciasTotales;
    }

    public Integer getRebotesTotales() {
        return rebotesTotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCanastasTotales(Integer canastasTotales) { this.canastasTotales = canastasTotales;
    }

    public void setAsistenciasTotales(Integer asistenciasTotales) { this.asistenciasTotales = asistenciasTotales;
    }

    public void setRebotesTotales(Integer rebotesTotales) {this.rebotesTotales = rebotesTotales;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", CanastasTotales=" + canastasTotales +
                ", AsistenciasTotales=" + asistenciasTotales +
                ", RebotesTotales=" + rebotesTotales +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
