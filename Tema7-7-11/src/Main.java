public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El nombre del viento", 500);

        libro.incrementarPagina(); // Página actual: 1
        libro.incrementarPagina(); // Página actual: 2
        libro.incrementarPagina(); // Página actual: 3

        int ultimaPagina = libro.obtenerUltimaPaginaLeida();
        System.out.println("Última página leída: " + ultimaPagina); // Última página leída: 3

        libro.reiniciarLectura(); // Has comenzado desde el principio del libro

        libro.incrementarPagina(); // Página actual: 1
    }
}
