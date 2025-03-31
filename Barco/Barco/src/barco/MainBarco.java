package barco;

public class MainBarco {

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Barco1 miBarco;
        int stockActual;

        miBarco = new Barco1("Titanic", 500000, 20, "Modelo Clásico", "Blanco");

        operativa_barcos(miBarco);

        stockActual = miBarco.obtenerStock();
        System.out.println("El stock actual es: " + stockActual);

        double valorStock = miBarco.calcularValorStock();
        System.out.println("El valor total del stock es: " + valorStock);

        miBarco.personalizarBarco("Modelo Deportivo", "Rojo");
        System.out.println("El modelo actual es: " + miBarco.obtenerModelo());
        System.out.println("El color actual es: " + miBarco.obtenerColor());
    }

    /**
     * Realiza operaciones de compra y venta de barcos.
     * 
     * @param miBarco Instancia de Barco1 sobre la que se operará
     */
    public static void operativa_barcos(Barco1 miBarco) {
        try {
            System.out.println("Venta de Barcos");
            miBarco.vender(5);
        } catch (Exception e) {
            System.out.println("Fallo al vender: " + e.getMessage());
        }

        try {
            System.out.println("Compra de Barcos");
            miBarco.comprar(10);
        } catch (Exception e) {
            System.out.println("Fallo al comprar: " + e.getMessage());
        }
    }
}
