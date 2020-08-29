package Clase01.semana2;

import java.util.Scanner;

public class Ejercicio7y8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String name = "Enzo";
        String password = "4321";

        for(int i = 0; i<= 10; i++){
            System.out.println("LOGIN");
            System.out.println("Ingrese nombre de Usuario");
            String user = entrada.nextLine();
            System.out.println("Ingrese la contraseña");
            String pass = entrada.nextLine();

            if(user.equals(name) && pass.equals(password)){
                System.out.println("Logueado correctamente");
                System.out.println("1 - cambiar contraseña");
                System.out.println("2 - salir");
                String opcion = entrada.nextLine();
                if(opcion.equals("1")) {

                    System.out.println("Contraseña Antigua: ");
                    String antiguaPass = entrada.nextLine();

                    if(antiguaPass.equals(pass)){
                        System.out.println("Contraseña Nueva: ");
                        String newPass = entrada.nextLine();
                        System.out.println("Su nueva contraseña es: " + newPass);
                        password = newPass;
                    }else{
                        System.out.println("Contraseña Incorrecta");
                    }
                }else if(opcion.equals("2")){
                    break;
                }

            }else{
                System.out.println("Upss... Hubo un error");
            }
        }

    }
}
