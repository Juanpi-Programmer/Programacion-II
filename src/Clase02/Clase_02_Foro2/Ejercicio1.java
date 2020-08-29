package Clase02.Clase_02_Foro2;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] oracion = new String[4];
        for (int i = 0; i < oracion.length; i++) {
            System.out.println("Ingrese una oracion");
            String newOracion = input.nextLine();
            if(!newOracion.equals("")){
                oracion[i] = newOracion;
            }
        }
        for (int i = 0; i< oracion.length; i++){
            System.out.println("----------");
            System.out.println(oracion[i]);
        }
    }
}
