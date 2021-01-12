package Model;

public class Tipo {
    public Integer ID;
    public String Tipo_Evento;

    public Tipo(Integer ID, String tipo_Evento) {
        this.ID = ID;
        Tipo_Evento = tipo_Evento;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTipo_Evento() {
        return Tipo_Evento;
    }

    public void setTipo_Evento(String tipo_Evento) {
        Tipo_Evento = tipo_Evento;
    }
}
