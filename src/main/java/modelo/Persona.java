package modelo;

public abstract class Persona {
    private String nombre;
    private String rut;

    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public abstract String getTipo();


    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\n" +
               "Rut: " + this.rut + "\n";
    }
}