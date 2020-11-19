package Clase03.Clase03_Foro1;

public class Main {
    public static void main(String[] args) {
        Escuela escuelita = new Escuela("Facundo Master Mayorga", "Doctorado");
        System.out.println(escuelita);
        Grado grado = new Grado("Doctorado", 500, "Hogwarts", "2do");
        System.out.println(grado);

        System.out.println("----------------CASTING Escuela -> ");
        Escuela escuelita2 = (Escuela) grado;
        System.out.println(escuelita2);

        System.out.println("----------------CASTING GRADO??? -> ");
        Grado gradito2 = (Grado) escuelita;
        System.out.println(gradito2);
    }
}
