public class Libro {
    private String titulo;
    private int paginaActual;
    private int totalPaginas;

    public Libro(String titulo, int totalPaginas) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
        this.paginaActual = 0;
    }

    public void incrementarPagina() {
        if (paginaActual < totalPaginas) {
            paginaActual++;
            System.out.println("Página actual: " + paginaActual);
        } else {
            System.out.println("Ya has terminado el libro");
        }
    }

    public int obtenerUltimaPaginaLeida() {
        return paginaActual;
    }

    public void reiniciarLectura() {
        paginaActual = 0;
        System.out.println("Has comenzado desde el principio del libro");
    }
}
