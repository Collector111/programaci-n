package dni;
import java.util.Scanner;
public class dni {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        int dni;
        int pos;

        System.out.println("Introduzca su dni sin letra: ");
        dni=leer.nextInt();

        pos=dni%23;


        System.out.println("Tu dni es: "+dni+letras.charAt(pos));
        leer.close();
    }
}
