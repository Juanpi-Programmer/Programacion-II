package Clase01.Foro4Clase1;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        String A = Vista.leerAtributo("Nombre");
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = entrada.nextLine();
        Vista.escribirAtributo(A, nombre);
    }
}
