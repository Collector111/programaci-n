package funciones.f3;
import java.util.Scanner;
public class f3 {
    public static void main(String[] args) {
        // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        Scanner leer=new Scanner(System.in);

        System.out.println("Introduce una edad: ");
        int edad=leer.nextInt();

        System.out.println("Es mayor de edad?");
        System.out.println(comprobaredad(edad));

        leer.close();
    }


    public static boolean comprobaredad(int edad){
        if(edad>=18){
            return true;
        }else{
            return false;
        }
    }
}
