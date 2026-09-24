package areatriangulo;
import java.util.Scanner;;

public class areatriangulo {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double area;
        double base;
        double altura;

        System.out.println("Introduce la altura del triangulo:");
        altura=leer.nextDouble();
        System.out.println("Introduce la base del triangulo:");
        base=leer.nextDouble();

        area=base*altura/2.0;

        System.out.println("El area es: "+area);
    }
}
