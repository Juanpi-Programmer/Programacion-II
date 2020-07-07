package Clase_02_Foro3.Basico;

public class LibretaBasica {
    String nombres[] = new String[11];

    public void agregarAlibreta(String nom, int lugar) {
        int cont = 1;
        for (int i = 1; i < this.nombres.length; i++){
            if(nombres[i] != null){
                cont++;
            }
        }
        if(cont > this.nombres.length){
            System.out.println("¡¡¡¡¡¡¡¡No se pueden cargar mas datos!!!!!!!!!!");
            System.out.println("Libreta completa");
        }else{
            if(lugar > this.nombres.length){
                System.out.println("¡¡¡¡¡¡¡¡¡¡la posicion " + lugar + " no existe!!!!!!!!!!!");
            }else if(!nom.equals("")){
                String name = nom;
                boolean bandera = true;
                for (int i = 1; i < this.nombres.length; i++){
                    if(name.equals(nombres[i])){
                        bandera = false;
                        break;
                    }else{
                        bandera = true;
                    }
                }
                if(bandera == true){
                    System.out.println("----------Datos cargados correctamente---------------");
                    this.nombres[lugar] = nom;
                }else{
                    System.out.println("¡¡¡¡¡¡¡¡¡Error, ese nombre ya está cargado!!!!!!!!!!!!!");
                }
            }
        }
    }

    public void listarLibreta() {
        for(int i = 1; i < this.nombres.length; i++) {
            if(nombres[i] == null){
                this.nombres[i] = "";
            }
            System.out.println(i+") --> "+nombres[i]);
        }
    }

    public void eliminarNombre(String nom) {
        boolean bandera = true;
        for(int i = 1; i < this.nombres.length; i++) {
            if(nom.equals(nombres[i])){
                this.nombres[i] = null;
                bandera = true;
                break;
            }else {
                bandera = false;
            }
        }
        if(bandera == true){
            System.out.println("Nombre: " + nom + " Eliminado correctamente");
        }
    }

    public void eliminarPosition(int lugar){
        boolean bandera = true;
        for(int i = 1; i < this.nombres.length; i++) {
            if(lugar == i){
                this.nombres[i] = null;
                bandera = true;
                break;
            }else {
                bandera = false;
            }
        }
        if(bandera == true){
            System.out.println("Posicion: " + lugar + " Eliminado correctamente");
        }
    }
}
