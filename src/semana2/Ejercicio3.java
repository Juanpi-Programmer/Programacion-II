package semana2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Actividad 3");
        System.out.println("Escribir un programa que, modificando el anterior, imprima los números enteros entre ");
        System.out.println("los dos ingresados siempre de menor a mayor, independientemente del orden en que los ingresó el usuario.");

        int num1,num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca otro numero: ");
        num2 = entrada.nextInt();

        if(num1>num2){
            for (int i=num2; i <= num1; i++){
                System.out.println(i);
            }
        }else{
            for (int i=num1; i <= num2; i++){
                System.out.println(i);
            }
        }

    }
}
