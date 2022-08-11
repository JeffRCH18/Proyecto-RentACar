package objetos;

import java.util.Date;

public class Cliente {
    private String cedula;
    private String nombre;
    private String fecha;
    private String correo;
    private String categoria;

    public Cliente(String cedula, String nombre, String fecha, String correo, String categoria) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha = fecha;
        this.correo = correo;
        this.categoria = categoria;
    }

    public Cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    @Override
    public String toString(){
        return "Persona{"+"Nombre="+this.nombre+", cedula"+this.cedula+"Correo:"+this.correo+", Fecha"+this.fecha+", Categoria"+this.categoria+'}';
    }
    
}
