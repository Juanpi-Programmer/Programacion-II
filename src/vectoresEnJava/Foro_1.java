package vectoresEnJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Foro_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vec [] = new int [4];
        int tmp = 0;
        boolean bandera = false;
        for (int i=0; i < vec.length; i++){
            System.out.println("Ingrese un valor numérico: ");
            int num = input.nextInt();
            for (int j=0; j< vec.length; j++){
                if(vec[j] == num){
                    bandera = true;
                    System.out.println("numero repetido encontrado: " + num);
                    break;
                }
            }
            if(bandera == true){
                break;
            }else{
                if(num % 7 != 0){
                    vec[i] = num;
                }else{
                    bandera = true;
                    System.out.println("Multiplo de 7 encontrado: " + num);
                    break;
                }
            }
        }

        if(bandera == true){
            System.out.println(" ---- Hay numeros repetidos o multiplos de 7 ---- ");
        }else {
            for (int i = 0; i < vec.length; i++) {
                for (int j = 1; j < (vec.length - i); j++) {
                    if (vec[j - 1] > vec[j]) {
                        tmp = vec[j - 1];
                        vec[j - 1] = vec[j];
                        vec[j] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(vec));
        }
    }
}
