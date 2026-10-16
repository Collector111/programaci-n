package articulos;
import java.util.Scanner;
public class Articulos {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String articulo="";
        int contadorDeArticulos=0;
        double precio;
        double sumaPrecio=0;

        do {
           System.out.println("Introduce un articulo: ");
           articulo=leer.nextLine();
           System.out.println("Introduce el precio del articulo: ");
           precio=leer.nextDouble();
           System.out.println("Introduce el numero de articulos de este tipo: ");
           contadorDeArticulos=leer.nextInt();
           leer.nextLine();
           if(contadorDeArticulos>1){
            precio=precio*contadorDeArticulos;
           }
           switch (contadorDeArticulos) {
            case 1:
                System.out.println("No hay descuento");
                break;
            case 2:
                System.out.println("Tienes un 10% de descuento");
                precio=(0.10*precio)-precio;
                sumaPrecio=sumaPrecio+precio;
                break;
            case 3:
                System.out.println("Tienes un 10% de descuento");
                precio=(0.10*precio)-precio;
                sumaPrecio=sumaPrecio+precio;
                break;
            case 4:
                System.out.println("Tienes un 10% de descuento");
                precio=(0.10*precio)-precio;
                sumaPrecio=sumaPrecio+precio;
                break;
            case 5:
                System.out.println("Tienes un 30% de descuento");
                precio=(0.30*precio)-precio;
                sumaPrecio=sumaPrecio+precio;
                break;
           }
            
        } while (articulo!="");

        System.out.println("La cuenta total es: "+sumaPrecio);

        leer.close();
    }
}
