package Model;

public class Estatus {
    public Integer ID;
    public String Estatus;

    public Estatus(Integer ID, String estatus) {
        this.ID = ID;
        Estatus = estatus;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String estatus) {
        Estatus = estatus;
    }
}
