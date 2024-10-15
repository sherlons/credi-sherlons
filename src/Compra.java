
public class Compra implements Comparable<Compra>{
    private String nombreProducto;
    private double valor;

    public Compra(String nombreProducto, double valor) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: nombreProducto ='" + nombreProducto + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public int compareTo(Compra otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.getValor()));
    }
}

