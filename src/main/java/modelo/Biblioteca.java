package modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> listaLibros;
    private String nombreBiblioteca;
    private String direccionBiblioteca;
    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();
    private List<Bibliotecario> listaBibliotecarios = new ArrayList<>();

    public Biblioteca(String nombreBiblioteca, String direccionBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccionBiblioteca = direccionBiblioteca;
        this.listaLibros = new ArrayList<Libro>();
    }

    public String getNombreBiblioteca() {
        return this.nombreBiblioteca;
    }

    public String getDireccionBiblioteca() {
        return this.direccionBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public void setDireccionBiblioteca(String direccionBiblioteca) {
        this.direccionBiblioteca = direccionBiblioteca;
    }

    public List<Libro> getListaLibros() {
        return this.listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Prestamo> getListaPrestamos() {
        return this.listaPrestamos;
    }

    public void setListaPrestamos(List<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public List<Bibliotecario> getListaBibliotecarios() {
        return this.listaBibliotecarios;
    }

    public void setListaBibliotecarios(List<Bibliotecario> listaBibliotecarios) {
        this.listaBibliotecarios = listaBibliotecarios;
    }

    public void agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            this.listaLibros.add(libro);
        }
    }

    public Libro buscarLibro(String nombreLibro) {
        for (Libro libro : this.listaLibros) {
            if (libro.getNombreLibro().equals(nombreLibro)) {
                return libro;
            }
        }
        return null;
    }

    public List<Libro> obtenerLibroPorAutor(String autor) {
        List<Libro> libros = new ArrayList<Libro>();
        for (Libro libro : this.listaLibros) {
            if (libro.getAutor().equals(autor)) {
                libros.add(libro);
            }
        }
        return libros;
    }

    public boolean libroExiste(Libro libro) {
        for (Libro libroLista : listaLibros) {
            if(libro.getISBN().equals(libroLista.getISBN())) {
                return true;
            }
        }
        return false;
    }

    public void generarPrestamo(Prestamo prestamo) {
        if (this.listaPrestamos == null) {
            this.listaPrestamos = new ArrayList<>();
        }
        this.listaPrestamos.add(prestamo);
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        if (this.listaBibliotecarios == null) {
            this.listaBibliotecarios = new ArrayList<>();
        }
        this.listaBibliotecarios.add(bibliotecario);
    }
}