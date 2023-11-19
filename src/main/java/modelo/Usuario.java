package modelo;

public class Usuario {
    private String nombreUsuario;
    private String rut;
    private String numeroTelefonico;

    public Usuario(String nombreUsuario, String rut, String numeroTelefonico) {
        this.nombreUsuario = nombreUsuario;
        this.rut = rut;
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombreUsuario() {
        return this.nombreUsuario;
    }

    public String getRut() {
        return this.rut;
    }

    public String getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    @Override
    public String toString() {
        return "Nombre del usuario: " + this.nombreUsuario + "\n" +
               "Rut: " + this.rut + "\n" +
               "Numero telefonico: " + this.numeroTelefonico + "\n";
    }
}