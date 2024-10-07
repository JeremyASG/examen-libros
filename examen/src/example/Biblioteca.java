package example;


public class Biblioteca {

    private Libro[] libros;
    private int contador;

    // Constructor
    public Biblioteca() {
        libros = new Libro[10]; // 10 libros
        contador = 0;
    }

    // Metodo para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        if (libro == null) {
            System.out.println("El libro no puede ser nulo.");
            return;
        }
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
            System.out.println("Libro agregado: " + libro.getTitulo());
        } else {
            System.out.println("No hay espacio disponible en la biblioteca.");
        }
    }

    // Metodo para imprimir el catalogo de libros
    public void imprimirCatalogo() {
        System.out.println("Catalogo de la Biblioteca:");
        for (int i = 0; i < contador; i++) {
            libros[i].imprimirDetalles();
        }
    }
}
