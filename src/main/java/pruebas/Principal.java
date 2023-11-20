package pruebas;

import modelo.*;
import utils.GestorPDF;

public class Principal {
    public static void main(String[] args) {
        Inicializar();
    }

    public static void Inicializar() {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Universidad de La Frontera", "Av. Francisco Salazar 01145");

        biblioteca.getListaUsuarios().add(new Usuario("Juan", "12345678-9", "12345678"));
        biblioteca.getListaUsuarios().add(new Usuario("Pedro", "12345678-8", "12345670"));

        biblioteca.agregarBibliotecario(new Bibliotecario("Silvana", "12345678-5", "12345622", "1"));
        biblioteca.agregarBibliotecario(new Bibliotecario("Ana", "12345678-4", "12345621", "2"));

        biblioteca.agregarLibro(new Libro("El señor de los anillos", "J.R.R Tolkien", "Minotauro", "978-84-450-7571-7"));
        biblioteca.agregarLibro(new Libro("El hobbit", "J.R.R Tolkien", "Minotauro", "978-84-450-7571-8"));
        biblioteca.agregarLibro(new Libro("El silmarillion", "J.R.R Tolkien", "Minotauro", "978-84-450-7571-9"));
        biblioteca.agregarLibro(new Libro("El arte de la guerra", "Sun Tzu", "Minotauro", "978-84-450-7571-0"));

        biblioteca.buscarLibro("El silmarillion");
        biblioteca.buscarLibro("El arte de la guerra");

        biblioteca.libroExiste(new Libro("El señor de los anillos", "J.R.R Tolkien", "Minotauro", "978-84-450-7571-7"));
        biblioteca.libroExiste(new Libro("El arte de la guerra", "Sun Tzu", "Minotauro", "978-84-450-7571-0"));

        biblioteca.obtenerLibroPorAutor("J.R.R Tolkien");
        biblioteca.obtenerLibroPorAutor("Sun Tzu");

        biblioteca.generarPrestamo(new Prestamo(new Bibliotecario("Silvana", "12345678-5", "12345622", "1"), new Usuario("Juan", "12345678-9", "12345678"), new Libro("El señor de los anillos", "J.R.R Tolkien", "Minotauro", "978-84-450-7571-7"), "2021-06-01", "2021-06-08"));

        GestorPDF gestorPDF = new GestorPDF();
        try {
            gestorPDF.generarPrestamo(biblioteca.getListaPrestamos().get(0));
        } catch (Exception e) {
            System.out.println("Error al generar el pdf");
        }
    }
}