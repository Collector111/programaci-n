package Practicar.bucles.act5w;
import java.util.Scanner;
import java.util.Random;

public class act5w {
    /*Menú interactivo
Crea un menú que se repita hasta que el usuario seleccione "Salir":

1. Saludar
2. Mostrar un número
3. Mostrar los números del 1 al 10
4. Salir */
public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    Random random=new Random();
    int order;
    int banderin=0;
    int count=5700;
    

    while (banderin==0) {
        int randomcounter=random.nextInt(100);
        System.out.println("Menu:");
        System.out.println("1. Saludar");
        System.out.println("2. Mostrar numero random");
        System.out.println("3. Mostrar numeros del 1-10");
        System.out.println("4. Count up");
        System.out.println("5. Salir");
        System.out.println("<-------------------------------->");
        order=leer.nextInt();

        switch (order) {
            case 1:
                System.out.println("Hola Usuario totalmente desconocido");
                break;
            case 2:
                System.out.println(randomcounter);
                break;
            case 3:
                System.out.println("1,2,3,4,5,6,7,8,9,10");
                break;
            case 4:
                while (count!=57001) {
                    System.out.println(count);
                    count++;
                }
                break;
            default:
                banderin=1;
                break;
        }
        count=5700;

    }
    leer.close();
}

}
