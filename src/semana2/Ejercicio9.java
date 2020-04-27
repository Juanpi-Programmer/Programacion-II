package semana2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Escribir un programa que cuente las vocales de una frase ingresada por el usuario");
        System.out.println(" Por ejemplo, si el usuario ingresa la frase: “La poesia es la unica verdad” debe devolver 12.");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una Frase");
        String cadena = entrada.nextLine();

        int con = 0;
        for (int i = 0; i < cadena.length(); i++){
            if(
                    (cadena.charAt(i)=='a') ||
                    (cadena.charAt(i) == 'e') ||
                    (cadena.charAt(i) == 'i') ||
                    (cadena.charAt(i) == 'o') ||
                    (cadena.charAt(i) == 'u')
            ){
                con++;
            }
        }
        System.out.println("contiene " + con + " vocales");
    }
}
