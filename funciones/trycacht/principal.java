package funciones.trycacht;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = posicion.crearnums();

        System.out.println("Introduce una posicion:");
        int pos = sc.nextInt();

        int resultado = posicion.numdelarray(nums, pos);
        System.out.println("Resultado: " + resultado);
    }
}