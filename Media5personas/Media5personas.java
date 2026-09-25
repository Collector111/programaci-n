package Media5personas;

import java.util.Scanner;

public class Media5personas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String nombre1;
        String nombre2;
        String nombre3;
        String nombre4;
        String nombre5;

        int edad1;
        int edad2;
        int edad3;
        int edad4;
        int edad5;

        int media;

        System.out.println("Introduce un nombre: ");
        nombre1 = leer.nextLine();

        System.out.println("Introduce una edad: ");
        edad1 = leer.nextInt();
        leer.nextLine();

        System.out.println("Introduce un nombre: ");
        nombre2 = leer.nextLine();

        System.out.println("Introduce una edad: ");
        edad2 = leer.nextInt();
        leer.nextLine();

        System.out.println("Introduce un nombre: ");
        nombre3 = leer.nextLine();

        System.out.println("Introduce una edad: ");
        edad3 = leer.nextInt();
        leer.nextLine();

        System.out.println("Introduce un nombre: ");
        nombre4 = leer.nextLine();

        System.out.println("Introduce una edad: ");
        edad4 = leer.nextInt();
        leer.nextLine();

        System.out.println("Introduce un nombre: ");
        nombre5 = leer.nextLine();

        System.out.println("Introduce una edad: ");
        edad5 = leer.nextInt();
        leer.nextLine();

        media = (edad1 + edad2 + edad3 + edad4 + edad5) / 5;

        System.out.println("Se llama " + nombre1 + " y tiene " + edad1 + " años");
        System.out.println("Se llama " + nombre2 + " y tiene " + edad2 + " años");
        System.out.println("Se llama " + nombre3 + " y tiene " + edad3 + " años");
        System.out.println("Se llama " + nombre4 + " y tiene " + edad4 + " años");
        System.out.println("Se llama " + nombre5 + " y tiene " + edad5 + " años");

        System.out.println("La media es: " + media);

        leer.close();
    }
}
