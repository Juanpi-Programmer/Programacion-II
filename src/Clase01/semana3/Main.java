package Clase01.semana3;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan","Fernández");
        Ciudadano ciudadano = new Ciudadano("Emir", "Maestu", "Mendoza", 42556321);

        System.out.println(persona.getNombre());
        System.out.println(ciudadano.getNombre());

    }
}
