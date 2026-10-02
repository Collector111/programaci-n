package PuedesPasar;
import java.util.Scanner;



public class PuedesPasar {
         // preguntar edad si es menor de edad no puede pasar salvo que sea su edad multiplo de 3

         public static void main(String[] args){
            Scanner leer= new Scanner(System.in);
            int edad;

            System.out.println("Introduce la edad:");
            edad=leer.nextInt();

            if(edad>18||edad%3==0){
               System.out.println("Puede pasar");
            }
            else{
               System.out.println("No puede pasar");
            }
            leer.close();
         }
}


