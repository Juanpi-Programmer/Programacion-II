package sample;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Actividad 2");
        System.out.println("Escribir un programa que reciba dos números por consola e imprima todos los números enteros entre esos dos números.");

        int num1,num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca el numero inicial ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca el numero final: ");
        num2 = entrada.nextInt();

        for (int i=num1; i <= num2; i++){
            System.out.println(i);
        }

    }
}
