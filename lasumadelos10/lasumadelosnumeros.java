package lasumadelos10;

import java.util.Scanner;

public class lasumadelosnumeros {
    // ahora hasta que introduzcas 999
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        int suma = 0;

        while (num != 999) {
            System.out.println("Introduce un numero: ");
            num = leer.nextInt();

            if (num < 999) {
                suma = suma + num;
            }
        }
        System.out.println("La suma de los numeros es: " + suma);
        leer.close();
    }
}
