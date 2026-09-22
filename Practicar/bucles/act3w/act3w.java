package Practicar.bucles.act3w;

import java.util.Scanner;

public class act3w {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        //Pide un número y muestra su tabla del 1 al 10 usando while.

        int num=0;
        int marginalcounter=0;

        System.out.println("Introduce un numero: ");
        num=leer.nextInt();

        while (marginalcounter<=10) {
            System.out.println(num+" x "+marginalcounter+"= "+num*marginalcounter);

            marginalcounter++;
        }

        leer.close();
    }
}
