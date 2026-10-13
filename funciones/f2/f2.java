package funciones.f2;
import java.util.Scanner;

public class f2 {
    public static void main(String[] args) {
        // 3. Haz un método que reciba dos números enteros y devuelva su resta.
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num1=leer.nextInt();
        System.out.println("introduce otro numero:");
        int num2=leer.nextInt();

        System.out.println("La resta es: "+ resta(num1,num2));
        leer.close();
    }

    public static int resta(int num1,int num2){
        int resta=num1-num2;
        return resta;
    }
    
}
