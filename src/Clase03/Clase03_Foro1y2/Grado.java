package Clase03.Clase03_Foro1y2;

public class Grado extends Escuela{
    private String nom;
    private int cantAlumn;

    public Grado(String nom, int cantAlumn, String nombre, String nivel) {
        super(nombre, nivel);

        this.nom = nom;
        this.cantAlumn = cantAlumn;
    }

    public void setCantAlumn(int cantAlumn) {
        this.cantAlumn = cantAlumn;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCantAlumn() {
        return cantAlumn;
    }
    public String getNom() {
        return nom;
    }

    public String toString() {
        return super.getNombre() + " | " + super.getNivel() + " | " +  this.nom + " | " +this.cantAlumn;
    }
}
