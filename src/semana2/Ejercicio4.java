package semana2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Actividad 4");
        System.out.println("Escribir un programa similar al anterior, pero que no imprima los múltiplos de 5");

        int num1,num2;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca otro numero: ");
        num2 = entrada.nextInt();

        if(num1>num2){
            for (int i=num2; i <= num1; i++){
                if(i%5!= 0){
                    System.out.println(i);
                }
            }
        }else{
            for (int i=num1; i <= num2; i++){
                if(i%5!= 0){
                    System.out.println(i);
                }
            }
        }
    }
}
