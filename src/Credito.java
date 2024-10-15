import java.util.ArrayList;
import java.util.List;

public class Credito {

    private double topeCredito;
    private double saldo;
    private List<Compra> listaDeCompras;

    public Credito(double topeCredito) {
        this.topeCredito = topeCredito;
        this.saldo = topeCredito;
        this.listaDeCompras = new ArrayList<>();
    }
    public boolean tienda(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }


    public double getTopeCredito() {
        return topeCredito;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }

}
