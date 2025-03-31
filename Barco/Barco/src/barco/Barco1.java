package barco;

class Barco1 {
    private String nombre;
    private double precio;
    private int stock;
    private String modelo;
    private String color;

    /**
     * Constructor para crear un objeto Barco1.
     * 
     * @param nombre Nombre del barco
     * @param precio Precio del barco
     * @param stock Cantidad disponible en stock
     * @param modelo Modelo del barco
     * @param color Color del barco
     */
    public Barco1(String nombre, double precio, int stock, String modelo, String color) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Vende una cantidad de barcos si hay suficiente stock.
     * 
     * @param cantidad Cantidad de barcos a vender
     * @throws Exception Si no hay suficiente stock disponible
     */
    public void vender(int cantidad) throws Exception {
        if (cantidad > stock) {
            throw new Exception("Stock insuficiente para la venta.");
        }
        stock -= cantidad;
    }

    /**
     * Añade barcos al stock.
     * 
     * @param cantidad Cantidad de barcos a comprar
     */
    public void comprar(int cantidad) {
        stock += cantidad;
    }

    /**
     * Devuelve la cantidad de barcos en stock.
     * 
     * @return Cantidad de barcos en stock
     */
    public int obtenerStock() {
        return stock;
    }

    /**
     * Calcula el valor total del stock de barcos.
     * 
     * @return Valor total del stock
     */
    public double calcularValorStock() {
        return stock * precio;
    }

    /**
     * Aplica un descuento al precio del barco.
     * 
     * @param porcentaje Porcentaje de descuento a aplicar
     * @throws Exception Si el porcentaje es menor que 0 o mayor que 100
     */
    public void aplicarDescuento(double porcentaje) throws Exception {
        if (porcentaje < 0 || porcentaje > 100) {
            throw new Exception("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        precio -= precio * (porcentaje / 100);
    }

    /**
     * Permite personalizar el modelo y color del barco.
     * 
     * @param modelo Nuevo modelo del barco
     * @param color Nuevo color del barco
     */
    public void personalizarBarco(String modelo, String color) {
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Devuelve el modelo del barco.
     * 
     * @return Modelo del barco
     */
    public String obtenerModelo() {
        return modelo;
    }

    /**
     * Devuelve el color del barco.
     * 
     * @return Color del barco
     */
    public String obtenerColor() {
        return color;
    }
}
