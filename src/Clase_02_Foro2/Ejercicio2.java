package Clase_02_Foro2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] users = {"Daiana", "Facundo", "Osvaldo", "Melina"};
        String[] pass = {"1234", "4321", "1122", "3344"};
        String message = "";
        boolean bandera = false;
        for (int i = 0; i < 10; i++){
            System.out.println("Welcome to Lavalle");
            System.out.println("User:");
            String user = input.nextLine();
            System.out.println("password:");
            String password = input.nextLine();
            if ((!user.equals("")) && (!password.equals(""))){
                for (int j=0; j < users.length; j++){
                    if(user.equals(users[j])){
                        if(password.equals(pass[j])){
                            System.out.println(" --------------");
                            System.out.println(" | Bienvenido " + users[j]);
                            System.out.println(" --------------");
                            bandera = true;
                            break;
                        }else{
                            message = "Contraseña Incorrecta";
                            break;
                        }
                    }else{
                        message = "Usuario Incorrecto";
                    }
                }
                if(bandera != true){
                    System.out.println("********* " + message + " +++++++");
                }
            }else{
                System.out.println("COMPLETE LOS CAMPOS");
            }
        }
    }
}
