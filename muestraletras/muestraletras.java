package muestraletras;
import java.util.Scanner;
public class muestraletras {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String palabra;
        System.out.println("Escribe 3 letras:");
        palabra=leer.next();
        System.out.println("1: "+palabra);
        palabra=leer.next();
        System.out.println("2: "+palabra);
        palabra=leer.next();
        System.out.println("3: "+palabra);
        palabra=leer.next();
        leer.close();
    }
}
