package medianumerosv1;

import java.util.Scanner;

public class MediaNumerosv1 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int cont;
        int num;
        int suma=0;
        int media;

        System.out.println("Cuantos numeros vas a introducir?");
        cont=leer.nextInt();
        if(cont>=0){
         for(int i=0;i<cont;i++){
            System.out.println("Introduce un numero:");
            num=leer.nextInt();
            if(num>0){
            suma=suma+num;
            }
            else{
                System.out.println("No se permiten numeros negativos");
                i--;
            }
            
        }   
        }else{
            System.out.println("No hay media");
        }
        media=suma/cont;

        System.out.println("La media es: "+media);

        
        leer.close();
    }
}
