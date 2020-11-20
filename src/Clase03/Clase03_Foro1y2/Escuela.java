package Clase03.Clase03_Foro1y2;

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

    public boolean equals(Object o){
        Escuela escuela = (Escuela) o;
        return (escuela.nombre == nombre) && (escuela.nivel == nivel);
    }
    public String toString() {
        return " nombre: " + nombre + " nivel: " + nivel;
    }

}
