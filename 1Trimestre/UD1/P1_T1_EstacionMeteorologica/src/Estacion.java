import java.sql.Date;

public class Estacion {
    
    private Date date;
    private String nombre;
    private Double tmax;
    private Double tmin;

    public Estacion(Date date, String nombre, Double tmax, Double tmin) {
        this.date = date;
        this.nombre = nombre;
        this.tmax = tmax;
        this.tmin = tmin;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getTmax() {
        return tmax;
    }
    public void setTmax(Double tmax) {
        this.tmax = tmax;
    }
    public Double getTmin() {
        return tmin;
    }
    public void setTmin(Double tmin) {
        this.tmin = tmin;
    }

    
}
