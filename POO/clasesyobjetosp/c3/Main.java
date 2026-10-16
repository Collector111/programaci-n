package POO.clasesyobjetosp.c3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int nota;
        var Estudiante1=new Estudiante("Aitor Marrero Torres");
        System.out.println("Introduce la nota: ");
        nota=leer.nextInt();
        Estudiante1.comprobarNota(nota);
        leer.close();
    }
}
