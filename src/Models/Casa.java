package Models;

public class Casa extends Inmubles{
    private double MaxmetrosTerreno;
    private double MaxmetrosAltura;
    private int numCuarto;

    public Casa(String id, String tipo, boolean estado, double precio, double area, double maxmetrosTerreno, double maxmetrosAltura, int numCuarto) {
        super(id, tipo, estado, precio, area);
        MaxmetrosTerreno = maxmetrosTerreno;
        MaxmetrosAltura = maxmetrosAltura;
        this.numCuarto = numCuarto;
    }

    public double getMaxmetrosTerreno() {
        return MaxmetrosTerreno;
    }

    public void setMaxmetrosTerreno(double maxmetrosTerreno) {
        MaxmetrosTerreno = maxmetrosTerreno;
    }

    public double getMaxmetrosAltura() {
        return MaxmetrosAltura;
    }

    public void setMaxmetrosAltura(double maxmetrosAltura) {
        MaxmetrosAltura = maxmetrosAltura;
    }

    public int getNumCuarto() {
        return numCuarto;
    }

    public void setNumCuarto(int numCuarto) {
        this.numCuarto = numCuarto;
    }
}
