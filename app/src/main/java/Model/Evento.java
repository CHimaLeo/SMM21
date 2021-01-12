package Model;

import java.util.Timer;

public class Evento {
    public Integer ID;
    public String Titulo;
    public String Donante;
    public String Direccion;
    public Timer Hora;
    public String Imagen;
    public Integer ID_Fecha;
    public Integer ID_Tipo;
    public Integer ID_Estatus;

    public Evento(Integer ID, String titulo, String donante, String direccion, Timer hora, String imagen, Integer ID_Fecha, Integer ID_Tipo, Integer ID_Estatus) {
        this.ID = ID;
        Titulo = titulo;
        Donante = donante;
        Direccion = direccion;
        Hora = hora;
        Imagen = imagen;
        this.ID_Fecha = ID_Fecha;
        this.ID_Tipo = ID_Tipo;
        this.ID_Estatus = ID_Estatus;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDonante() {
        return Donante;
    }

    public void setDonante(String donante) {
        Donante = donante;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Timer getHora() {
        return Hora;
    }

    public void setHora(Timer hora) {
        Hora = hora;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public Integer getID_Fecha() {
        return ID_Fecha;
    }

    public void setID_Fecha(Integer ID_Fecha) {
        this.ID_Fecha = ID_Fecha;
    }

    public Integer getID_Tipo() {
        return ID_Tipo;
    }

    public void setID_Tipo(Integer ID_Tipo) {
        this.ID_Tipo = ID_Tipo;
    }

    public Integer getID_Estatus() {
        return ID_Estatus;
    }

    public void setID_Estatus(Integer ID_Estatus) {
        this.ID_Estatus = ID_Estatus;
    }
}
