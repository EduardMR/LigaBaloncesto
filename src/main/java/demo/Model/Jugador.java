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
    private Integer CanastasTotales;
    private Integer AsistenciasTotales;
    private Integer RebotesTotales;
    private String posicion;

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
        return CanastasTotales;
    }

    public Integer getAsistenciasTotales() {
        return AsistenciasTotales;
    }

    public Integer getRebotesTotales() {
        return RebotesTotales;
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

    public void setCanastasTotales(Integer canastasTotales) {
        CanastasTotales = canastasTotales;
    }

    public void setAsistenciasTotales(Integer asistenciasTotales) {
        AsistenciasTotales = asistenciasTotales;
    }

    public void setRebotesTotales(Integer rebotesTotales) {
        RebotesTotales = rebotesTotales;
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
                ", CanastasTotales=" + CanastasTotales +
                ", AsistenciasTotales=" + AsistenciasTotales +
                ", RebotesTotales=" + RebotesTotales +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
