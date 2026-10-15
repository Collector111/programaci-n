package lasumadelos10;
import java.util.Scanner;
public class lasumadelos10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int suma=0;
        int num;
        for(int i=0;i<10;i++){
            System.out.println("Introduce un numero:");
            num=leer.nextInt();

            suma=suma+num;
        }
        System.out.println("La suma de los numeros es: "+suma);
        leer.close();
    }
}
