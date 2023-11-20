package modelo;

public class Usuario extends Persona{
    private String numeroTelefonico;

    public Usuario(String nombreUsuario, String rut, String numeroTelefonico) {
        super(nombreUsuario, rut);
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNumeroTelefonico() {
        return this.numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getTipo() {
        return "Usuario";
    }
}
