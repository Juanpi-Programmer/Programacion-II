package vectoresEnJava;

import java.util.Arrays;

public class Foro_1_Aleatorio {
    public static void main(String[] args) {
        int vec [] = new int [10];
        int tmp = 0;
        boolean bandera = true;
        for (int i=0; i < vec.length; i++) {
            int aleatorio = (int) (Math.random() * 20) + 1;
            for (int j = 0; j < vec.length; j++) {
                if (vec[j] == aleatorio) {
                    System.out.println("numero repetido encontrado: " + aleatorio);
                    bandera = false;
                    if (vec[j] % 7 != 0) {
                        bandera = false;
                    } else {
                        System.out.println("Multiplo de 7 encontrado: " + aleatorio);
                    }
                }
            }
            vec[i] = aleatorio;
        }

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
