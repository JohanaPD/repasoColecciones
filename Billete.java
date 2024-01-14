package iee.colecciones;

public class Billete implements  Comparable<Billete> {
    private String nombre;
    private int factorOrden;

    public Billete(String nombre, int algo) {
        this.nombre = nombre;
        this.factorOrden = algo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFactorOrden() {
        return factorOrden;
    }

    public void setFactorOrden(int factorOrden) {
        this.factorOrden = factorOrden;
    }

    @Override
    public String toString() {
        return "Billete{" +
                "nombre='" + nombre + '\'' +
                ", factorOrden=" + factorOrden +
                '}';
    }

    @Override
    public int compareTo(Billete o) {
        return -Integer.compare(factorOrden, o.getFactorOrden());
    }
}
