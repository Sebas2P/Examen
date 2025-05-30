package Models;

public class Inmubles {
    private String id;
    private String tipo;
    private boolean estado;
    private double precio;
    private double Area;

    public Inmubles(String id, String tipo, boolean estado, double precio, double area) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.precio = precio;
        Area = area;
    }

    public Inmubles() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }
}
