package PRUEBARELANPAGO;
import java.util.Scanner;
public class pruebarelanpago {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int filas=3;
        int columnas=7;
        int a=0;
        String palabra;

        System.out.println("Introduce una palabra:");
        palabra=leer.nextLine();
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.printf("%c ",palabra.charAt(a));
                a=(a+1)%palabra.length();
            }
            System.out.println();
        }
        leer.close();
    }
}
