package sample;

import java.util.Scanner;

public class Ejercicio5y6 {
    public static void main(String[] args) {
        System.out.println("Actividad 5 y 6");
        System.out.println("Escribir un programa similar al anterior, pero que no imprima los múltiplos de 5");

        int num1,num2, multiplo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca un numero: ");
        num1 = entrada.nextInt();

        System.out.println("Introduzca otro numero: ");
        num2 = entrada.nextInt();

        System.out.println("Introduzca el multiplo que no desee: ");
        multiplo = entrada.nextInt();

        if(num1>num2){
            int dif = num1-num2;
            if(dif <= multiplo){
                System.out.println("numero no permitido");
            }else{
                for (int i=num2; i <= num1; i++){
                    if(i%multiplo!= 0){
                        System.out.println(i);
                    }
                }
            }
        }else{
            int dif = num2-num1;
            if(dif <= multiplo){
                System.out.println("numero no permitido");
            }else{
                for (int i=num1; i <= num2; i++){
                    if(i%multiplo!= 0){
                        System.out.println(i);
                    }
                }
            }
        }
    }
}
