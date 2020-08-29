package Clase01.Foro4Clase1;

public class Vista {
    public static String leerAtributo(String atributo){
        if(!atributo.equals(null)){
            return atributo;
        }else{
            return "error";
        }
    }
    public static void escribirAtributo(String atributo, String valor){
        System.out.println(String.format("Atributo%s ",atributo));
        System.out.println(String.format("Valor%s ",valor));
    }
}
