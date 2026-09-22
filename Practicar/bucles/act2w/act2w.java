package Practicar.bucles.act2w;
import java.util.Scanner;
public class act2w {
    //Pide números continuamente. 
    // Cuando el usuario introduzca 0, termina y muestra la suma de todos los números anteriores.
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int num=1;
        int suma=0;

        while(num!=0){
           System.out.println("Introduce un numero:");
           num=leer.nextInt(); 

           suma=suma+num;
        }
        System.out.println("La suma es la siguiente: "+suma);
    }
}
