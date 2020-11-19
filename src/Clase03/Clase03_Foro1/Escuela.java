package Clase03.Clase03_Foro1;

public class Escuela {
    private String nombre, nivel;

    public Escuela(String nombre, String nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivel() {
        return nivel;
    }
    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return " nombre: " + nombre + " nivel: " + nivel;
    }

}
