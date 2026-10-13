package funciones.f4;
import java.util.Scanner;

public class f4 {
     // 7. Implementa una función que reciba una cadena y retorne su longitud.
     public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cadena;

        System.out.println("Introduce una cadena de caracteres: ");
        cadena=leer.nextLine();

        System.out.println("la longitud es: "+longitud(cadena));
        leer.close();
     }

     public static int longitud(String cadena){

        int max=cadena.length();

        return max;
     }
}
