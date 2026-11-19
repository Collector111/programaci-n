package funcionesclase.num;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int tope;
            int desde;
            System.out.println("Introduce el tope: ");
            tope = leer.nextInt();
            System.out.println("Introduce el desde: ");
            desde = leer.nextInt();

            act1.leerentero(tope);
            act1.leerenterov2(desde,tope);
        }

}