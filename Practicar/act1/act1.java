package Practicar.act1;

import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Introduce un numero:");
        num1=leer.nextInt();
        System.out.println("Introduce otro numero:");
        num2=leer.nextInt();

        int suma=num1+num2;

        System.out.println("El resultado es: " + suma);

        leer.close();
    }
}
