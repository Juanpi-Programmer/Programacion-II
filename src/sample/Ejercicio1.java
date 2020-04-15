package sample;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Actividad 1");
        System.out.println("Escribir un programa que reciba dos números por consola y devuelva su suma.");
        int num1, num2;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca el segundo número: ");
        num2 = entrada.nextInt();


        System.out.println("El resultado es: " + (num1 + num2));
    }
}
