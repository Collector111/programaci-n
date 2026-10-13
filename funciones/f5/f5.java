package funciones.f5;

import java.util.Random;

public class f5 {
    public static void main(String[] args) {
        // 8. Crea un método que reciba un array de enteros, calcula su media y lo
        // retorna.
        Random random = new Random();
        int[] enteros = new int[8];

        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = random.nextInt(1, 100);
        }

        System.out.println("La media es: " + media(enteros));
    }

    public static int media(int[] enteros) {

        int suma = 0;
        int media;

        for (int i = 0; i < enteros.length; i++) {
            suma = suma + enteros[i];

        }

        media = suma / enteros.length;

        return media;
    }
}
