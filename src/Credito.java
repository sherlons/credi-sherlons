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
