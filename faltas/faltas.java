
package faltas;

import java.util.Scanner;

public class faltas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int bae;
        int pro;
        int lnd;
        String respuesta = "No";

        while (respuesta.equalsIgnoreCase("no")) {

            System.out.println("Introduce faltas bae:");
            bae = leer.nextInt();

            System.out.println("Introduce faltas pro:");
            pro = leer.nextInt();

            System.out.println("Introduce faltas lnd:");
            lnd = leer.nextInt();

            bae = 32 - bae;
            pro = 39 - pro;
            lnd = 26 - lnd;

            System.out.println("Te quedan " + bae + " de bae, "
                    + pro + " de pro y " + lnd + " de lnd");

            System.out.println("¿Quieres salir? Si/No");
            respuesta = leer.next();
        }

        leer.close();
    }
}


