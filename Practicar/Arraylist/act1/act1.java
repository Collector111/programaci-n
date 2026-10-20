package Practicar.Arraylist.act1;

import java.util.ArrayList;
import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        // Declarar un ArrayList de tipo String
        ArrayList<String> productos = new ArrayList<>();
        String producto;
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un producto:");
            producto = leer.nextLine();
            productos.add(producto);
        }
        // no hace falta un for para mostrar el contenido del mismo
        System.out.println(productos);

        System.out.println("El tamaño del ArrayList es: " + productos.size());
        leer.close();
    }
}
