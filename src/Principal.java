import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

//        System.out.println ("\n**********************************************");
//        System.out.println("****** Bienvenido a Credi Sherlons ********");
//        System.out.println ("**********************************************");

        Scanner teclado = new Scanner(System.in);
        System.out.println("escribe el valor que necesitas prestar: ");
        double topeCredito = teclado.nextDouble();
        Credito credito = new  Credito(topeCredito);

        int salir = 1;
        while (salir != 0){
            System.out.println("nombre de lo que quieres comprar: ");
            String nombreProducto = teclado.next();

            System.out.println("escribe el valor del Producto");
            double valor = Double.valueOf(teclado.next());

            Compra compra = new Compra(nombreProducto,valor);
            boolean compraRealizada = credito.tienda(compra);

            if (compraRealizada){
                System.out.println("Compra Realizada");
                System.out.println("Escribe 0 para salir o 1 para otra compra");
                salir = teclado.nextInt();
            } else {
                System.out.println("Saldo Insuficiente!!");
                salir = 0 ;
            }

        }
        System.out.println("********************************************************");
        System.out.println("**** COMPRAS REALIZADAS: ");
        Collections.sort(credito.getListaDeCompras());
        for (Compra compra: credito.getListaDeCompras()){
            System.out.println(compra.getNombreProducto() + " - " + compra.getValor());
        }
        System.out.println("\n**************************************************");
        System.out.println("\nSaldo de Credito: " + credito.getSaldo());
    }
}
