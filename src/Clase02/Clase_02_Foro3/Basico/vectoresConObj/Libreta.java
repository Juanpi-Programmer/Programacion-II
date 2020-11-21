package Clase02.Clase_02_Foro3.Basico.vectoresConObj;

import java.util.ArrayList;

public class Libreta {
    ArrayList nombresArrayList = new ArrayList();

    public boolean quedaLugar() {
        boolean respuesta = true;
        listarLibreta();
        return respuesta;
    }

    /* public int posicionesDisponibles() {
        int position = 0;
        for (int i=1; i < this.nombresArrayList.size(); i++){
            if(this.nombresArrayList.get(i).equals("")){
                position++;
            }
        }
        return position;
    } */

    public boolean agregarAlibreta(String nom) {
        boolean lugar = this.quedaLugar();
        boolean bandera = false;
        System.out.println(this.nombresArrayList.size());
        if(this.nombresArrayList.size() == 0) {
            this.nombresArrayList.add(nom);
        }else{
            if(lugar){
                for(int i=1; i < this.nombresArrayList.size(); i++){
                    if(nom.equals(this.nombresArrayList.get(i))){
                        bandera = true;
                    }else{
                        bandera = false;
                    }
                    break;
                }
                if(bandera){
                    System.out.println("-------------------------");
                    System.out.println("Nombre Repetido");
                    System.out.println("-------------------------");
                }else{
                    this.nombresArrayList.add(nom);
                    System.out.println("Agregado correctamente");
                /* int position = posicionesDisponibles();
                System.out.println("Posiciones Disponibles: " + position); */
                }
            }else{
                System.out.println("No quedan mas lugares");
            }
        }
        return bandera;
    }

    public void listarLibreta() {
        System.out.println("--listarLibreta() -->[Libreta]");
        for(int i=0;i < this.nombresArrayList.size();i++) {
            System.out.println(i+") --> " + this.nombresArrayList.get(i));
        }
    }

    public void eliminarNombre(String nom) {
        boolean bandera;
        bandera = nombresArrayList.remove(nom);
        if (bandera == true) {
            System.out.println("Nombre: " + nom + " Eliminado correctamente");
        }
    }

    public void eliminarPosition(int lugar) {
        nombresArrayList.remove(lugar);
        System.out.println("Posicion: " + lugar + " Eliminado correctamente");
    }
}
