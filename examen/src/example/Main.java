package example;

public class Main {
    public static void main(String[] args) {
        // Crear libros de la saga de JoJos Bizarre Adventure
        Libro libro1 = new Libro("JoJo's Bizarre Adventure: Part 1 - Phantom Blood", "Hirohiko Araki", "1421578804", true);
        Libro libro2 = new Libro("JoJo's Bizarre Adventure: Part 2 - Battle Tendency", "Hirohiko Araki", "1421578812", true);
        Libro libro3 = new Libro("JoJo's Bizarre Adventure: Part 3 - Stardust Crusaders", "Hirohiko Araki", "1421578820", true);
        Libro libro4 = new Libro("JoJo's Bizarre Adventure: Part 4 - Diamond is Unbreakable", "Hirohiko Araki", "1421578839", false);
        Libro libro5 = new Libro("JoJo's Bizarre Adventure: Part 5 - Golden Wind", "Hirohiko Araki", "1421578847", true);
        Libro libro6 = new Libro("JoJo's Bizarre Adventure: Part 6 - Stone Ocean", "Hirohiko Araki", "1421578855", true);

        // Crear biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Agregar los libros de JoJos Bizarre Adventure a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        biblioteca.agregarLibro(libro6);

        // Imprimir el catalogo de la biblioteca
        biblioteca.imprimirCatalogo();
    }
}




