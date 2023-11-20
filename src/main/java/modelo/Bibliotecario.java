package modelo;

public class Bibliotecario extends Persona{
    private String direccion;
    private String id;

    public Bibliotecario(String nombre, String rut, String direccion, String id) {
        super(nombre, rut);
        this.direccion = direccion;
        this.id = id;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getId() {
        return this.id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return "Bibliotecario";
    }
}
