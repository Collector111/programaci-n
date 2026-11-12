package nombresyalturas;

import java.util.Scanner;

public class nombresyalturas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] nombres = new String[10];
        double[] alturas = new double[10];
        double alturamayor = 0.0;
        double alturamenor = 0.0;
        int i;
        int posM=0;
        int posm=0;

        for (int x = 0; x < nombres.length; x++) {
            System.out.println("Introduce un nombre:");
            nombres[x] = leer.nextLine();
            System.out.println("Introduce una altura:");
            alturas[x] = leer.nextDouble();
        }

        for (i = 0; i < alturas.length; i++) {
            if (alturamayor < alturas[i]) {
                alturamayor = alturas[i];
                posM = i;
            }
            if (alturamenor>alturas[i]) {
                alturamenor=alturas[i];
                posm=i;
            }

        }

        System.out.println("La altura mas alta sin sobrepasar la introducida es " + alturamayor
                + " y el propietario de esa altura es " + nombres[posM] +" Y la altura mas baja es "+alturamenor+" y su propietario es "+nombres[posm]);
        leer.close();
    }
}
