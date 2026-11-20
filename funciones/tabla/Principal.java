package funciones.tabla;

import java.util.Scanner;

public class Principal  {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduce que cantidad de espacios quieres en la tabla: ");
        int cantidad=leer.nextInt();
        int[] table=tabla.crearTabla(cantidad);
        System.out.println("Introduce el numero a buscar: ");
        int numero=leer.nextInt();
        int busqueda=tabla.buscarentabla(numero,table);

        if(busqueda==0){
            System.out.println("El numero no esta en la tabla");
        }

        System.out.println(tabla.menordelatabla(table));
        System.out.println(tabla.mayortabla(table));
        tabla.topetabla(table);


    }
}