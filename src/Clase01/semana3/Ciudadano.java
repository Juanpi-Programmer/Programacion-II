package Clase01.semana3;

public class Ciudadano extends Persona{
    private String provincia;
    private long dni;


    public Ciudadano(String newNombre, String newApellido, String newProvincia, long newDni) {
        super(newNombre, newApellido);
        this.provincia = newProvincia;
        this.dni = newDni;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getProvincia() {
        return provincia;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    public long getDni() {
        return dni;
    }
}
