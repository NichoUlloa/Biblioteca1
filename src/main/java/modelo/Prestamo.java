package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    private Libro libro;
    private Date fechaInicio;
    private Date fechaTermino;

    public Prestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, String fechaInicio, String fechaTermino) {
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libro = libro;

        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

        try {
            this.fechaInicio = formatoFecha.parse(fechaInicio);
            this.fechaTermino = formatoFecha.parse(fechaTermino);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Bibliotecario getBibliotecario() {
        return this.bibliotecario;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    public Date getFechaTermino() {
        return this.fechaTermino;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    @Override
    public String toString() {
        return "Nombre del bibliotecario: " + this.bibliotecario.getNombreBibliotecario() + "\n" +
               "Nombre del usuario: " + this.usuario.getNombreUsuario() + "\n" +
               "Nombre del libro: " + this.libro.getNombreLibro() + "\n" +
               "Fecha de inicio: " + this.fechaInicio + "\n" +
               "Fecha de termino: " + this.fechaTermino + "\n";
    }
}

