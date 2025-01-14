package example;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private String ISBN;
    private boolean disponible;

    // Constructor 
    public Libro(String titulo, String autor, String ISBN, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.disponible = disponible;
    }

    // Constructor que inicializa solo titulo y autor, con valores predeterminados
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = "N/A"; // Valor predeterminado
        this.disponible = true; // Disponible por defecto
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Metodo imprimirDetalles que imprime todos los detalles
    public void imprimirDetalles() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + 
                           ", ISBN: " + ISBN + ", Disponible: " + (disponible ? "Sí" : "No"));
    }
}
