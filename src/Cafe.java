public class Cafe {
    private String nombre;
    private String tamano;
    private double precio;

    public Cafe(String nombre, String tamano, double precio) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.precio = precio;
    }

    public String MostrarTicket() {
        System.out.println("---Ticket Cafe---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tamano: " + this.tamano);
        System.out.println("Precio: " + this.precio);
        System.out.println("");
        return "";
    }

}
