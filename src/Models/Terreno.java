package Models;

public class Terreno extends Inmubles{
    //private String ubicacion;
    private String lote;
    private String suelo;

    public Terreno(String id, String tipo, boolean estado, double precio, double area, String lote, String suelo) {
        super(id, tipo, estado, precio, area);
        this.lote = lote;
        this.suelo = suelo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getSuelo() {
        return suelo;
    }

    public void setSuelo(String suelo) {
        this.suelo = suelo;
    }
}
