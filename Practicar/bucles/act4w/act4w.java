package Practicar.bucles.act4w;
import java.util.Random;
import java.util.Scanner;

public class act4w {
    //Guarda un número secreto, por ejemplo 37. El usuario debe intentar adivinarlo. Mientras no acierte, sigue pidiendo números y dile si el número secreto es mayor o menor.
    public static void main(String[] args) {
        Random random= new Random();
        Scanner leer=new Scanner(System.in);
        int randomcounter=random.nextInt(100);
        int numeropedido=0;

        while (numeropedido!=randomcounter) {
            System.out.println("Introduce un numero:");
            numeropedido=leer.nextInt();
            if(numeropedido!=randomcounter){
                if(numeropedido<randomcounter){
                    System.out.println("Es menor al numero secreto");
                }if(numeropedido>randomcounter){
                    System.out.println("Es mayor al numero secreto");
                }
            }
        }
        leer.close();
    }
}
