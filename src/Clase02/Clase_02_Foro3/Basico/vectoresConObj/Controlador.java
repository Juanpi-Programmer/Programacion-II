package Clase02.Clase_02_Foro3.Basico.vectoresConObj;

import java.util.Scanner;

public class Controlador {
    public static void main(String[] args) {

        Libreta miLibretita = new Libreta();
        Scanner input = new Scanner(System.in);
        String nombre;
        int opcion;
        int lugar;

        for (int i = 0; i < 100; i++){
            System.out.println("-------------------------------");
            System.out.println("Bienvenido a Libreta");
            System.out.println("Menu");
            System.out.println("1- Mostrar Libreta");
            System.out.println("2- Cargar Registro");
            System.out.println("3- Eliminar registro por nombre");
            System.out.println("4- Eliminar registro por posicion");
            System.out.println("5- Salir");
            opcion = input.nextInt();

            if(opcion == 1){
                miLibretita.listarLibreta();
            } else if(opcion == 2){
                input.nextLine();
                System.out.println("Nombre");
                nombre = input.nextLine();
                if(!nombre.equals("")){
                    miLibretita.agregarAlibreta(nombre);
                }
            } else if(opcion == 3){
                input.nextLine();
                System.out.println("Ingrese el nombre que desea eliminar");
                nombre = input.nextLine();
                miLibretita.eliminarNombre(nombre);
            } else if(opcion == 4){
                System.out.println("Ingrese la posicion que desea eliminar");
                lugar = input.nextInt();
                miLibretita.eliminarPosition(lugar);
            }else{
                break;
            }
        }
    }
}
