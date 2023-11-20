package modelo;

public class Libro {
    private String NombreLibro;
    private String Autor;
    private String Editorial;
    private String ISBN;

    public Libro(String NombreLibro, String Autor, String Editorial, String ISBN) {
        this.NombreLibro = NombreLibro;
        this.Autor = Autor;
        this.Editorial = Editorial;
        this.ISBN = ISBN;
    }

    public String getNombreLibro() {
        return this.NombreLibro;
    }

    public String getAutor() {
        return this.Autor;
    }

    public String getEditorial() {
        return this.Editorial;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }


    @Override
    public String toString() {
        return "Nombre del libro: " + this.NombreLibro + "\n" +
               "Autor: " + this.Autor + "\n" +
               "Editorial: " + this.Editorial + "\n" +
               "ISBN: " + this.ISBN + "\n";
    }
}
