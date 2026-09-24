package Practicar.bucles.act2f;
import java.util.Scanner;

public class act2f {
    //Pide 5 números al usuario, calcula su suma y muestra la media.

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        int suma=0;
        int media;

        for(int i=0;i<=5;i++){
            System.out.println("Introduce un numero:");
            num=leer.nextInt();
            suma=num+suma;
            
        }
        media=suma/5;
        System.out.println("La media es: "+media);
        leer.close();
    }
}
