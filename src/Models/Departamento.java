package Models;

public class Departamento extends Inmubles{
    private double alicuato;
    private int numPisos;

    public Departamento(String id, String tipo, boolean estado, double precio, double area, double alicuato, int numPisos) {
        super(id, tipo, estado, precio, area);
        this.alicuato = alicuato;
        this.numPisos = numPisos;
    }

    public double getAlicuato() {
        return alicuato;
    }

    public void setAlicuato(double alicuato) {
        this.alicuato = alicuato;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
}
