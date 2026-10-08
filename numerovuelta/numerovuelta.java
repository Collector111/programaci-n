package pro.numerovuelta;

import java.util.Scanner;

public class numerovuelta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Introduce un numero:");
        num = leer.nextInt();


        int centenas = num / 100;
        int decenas = (num / 10) % 10;
        int unidades = num % 10;

        int invertido = unidades * 100 + decenas * 10 + centenas;

        System.out.println(invertido);

        leer.close();
    }
}
