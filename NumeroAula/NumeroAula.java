package NumeroAula;
import java.util.Scanner;
public class NumeroAula {
    public static void main(String[] args) {
        //Alumno introduce en que aula esta el programa respondera correspondientemente ejem: 222= pabellon 2 piso 2 aula 2
        Scanner leer=new Scanner(System.in);
        int numeroaula;

        System.out.println("Introduce el numero del aula:");
        numeroaula=leer.nextInt();

        if(numeroaula<999){

        int pabellon = numeroaula / 100;
        int piso = (numeroaula / 10) % 10;
        int numeroAula = numeroaula % 10;

        System.out.println("Pabellón " + pabellon);
        System.out.println("Piso " + piso);
        System.out.println("Aula " + numeroAula);
        }
        else{
            System.out.println("No se permiten mayor a 999");
        }

        leer.close();
    }
}
