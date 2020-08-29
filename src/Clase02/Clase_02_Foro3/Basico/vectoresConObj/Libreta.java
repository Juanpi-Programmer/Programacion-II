package Clase02.Clase_02_Foro3.Basico.vectoresConObj;

public class Libreta {
    int cantidadRegistros;
    String nombres[];

    public Libreta(int cantidadRegistros) {
        System.out.println("Se ha instanciado una Libreta");
        this.cantidadRegistros = cantidadRegistros;
        nombres = new String[cantidadRegistros];
    }

    public boolean quedaLugar() {
        boolean respuesta = false;
        listarLibreta();
        for(int i=1; i<this.nombres.length; i++) {
            if(this.nombres[i].equals("")) {
                respuesta = true;
            }
        }
        return respuesta;
    }

    public int posicionesDisponibles() {
        int position = 0;
        for (int i=1; i < this.nombres.length; i++){
            if(this.nombres[i].equals("")){
                position++;
            }
        }
        return position;
    }

    public boolean agregarAlibreta(String nom) {
        boolean lugar = this.quedaLugar();
        boolean bandera = false;
        if(lugar){
            for(int i=1; i<this.nombres.length; i++){
                if(nom.equals(this.nombres[i])){
                    bandera = true;
                    break;
                }else{
                    bandera = false;
                    if(this.nombres[i].equals("")){
                        this.nombres[i] = nom;
                        break;
                    }
                }
            }
            if(bandera){
                System.out.println("-------------------------");
                System.out.println("Nombre Repetido");
                System.out.println("-------------------------");
            }else{
                System.out.println("Agregado correctamente");
                int position = posicionesDisponibles();
                System.out.println("Posiciones Disponibles: " + position);
            }
        }else{
            System.out.println("No quedan mas lugares");
        }

        return bandera;
    }

    public void listarLibreta() {
        System.out.println("--listarLibreta() -->[Libreta]");
        for(int i=1;i<cantidadRegistros;i++) {
            if(nombres[i] == null){
                this.nombres[i] = "";
            }
            System.out.println(i+") --> "+nombres[i]);
        }
    }

    public void eliminarNombre(String nom) {
        boolean bandera = true;
        for (int i = 1; i < this.nombres.length; i++) {
            if (nom.equals(nombres[i])) {
                this.nombres[i] = null;
                bandera = true;
                break;
            } else {
                bandera = false;
            }
        }
        if (bandera == true) {
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
