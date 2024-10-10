public class Compra {
    private String nombreProducto;
    private double valor;

    public Compra(String nombreProducto, double valor) {
        this.nombreProducto = nombreProducto;
        this.valor = valor;
    }
    //public boolean tienda(Compra compra){
       // if (this.saldo >= compra.getValor())
    //};

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getValor() {
        return valor;
    }
}
