package modelo;

public class Bibliotecario {
    private String nombreBibliotecario;
    private String rut;
    private String direccion;
    private String id;

    public Bibliotecario(String nombreBibliotecario, String rut, String direccion, String id) {
        this.nombreBibliotecario = nombreBibliotecario;
        this.rut = rut;
        this.direccion = direccion;
        this.id = id;
    }

    public String getNombreBibliotecario() {
        return this.nombreBibliotecario;
    }

    public String getRut() {
        return this.rut;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getId() {
        return this.id;
    }

    public void setNombreBibliotecario(String nombre) {
        this.nombreBibliotecario = nombreBibliotecario;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }
}