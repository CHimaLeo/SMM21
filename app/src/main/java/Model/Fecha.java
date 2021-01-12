package Model;

public class Fecha {
    public Integer ID;
    public Integer Dia;
    public String Mes;
    public Integer Año;
    public String Subtitulo;
    public String Imagen;

    public Fecha(Integer ID, Integer dia, String mes, Integer año, String subtitulo, String imagen) {
        this.ID = ID;
        Dia = dia;
        Mes = mes;
        Año = año;
        Subtitulo = subtitulo;
        Imagen = imagen;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Integer getDia() {
        return Dia;
    }

    public void setDia(Integer dia) {
        Dia = dia;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }

    public Integer getAño() {
        return Año;
    }

    public void setAño(Integer año) {
        Año = año;
    }

    public String getSubtitulo() {
        return Subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        Subtitulo = subtitulo;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
