package funciones.tabla;
import java.util.Scanner;
public class tabla {
    //funcion crear tabla
    public static int[] crearTabla(int cant){
        Scanner leer=new Scanner(System.in);
        int[] tabla = new int[cant];
        for(int i=0;i<cant;i++){
            System.out.println("Introduce un numero: ");
            tabla[i]=leer.nextInt();
        }
        return tabla;
    }
    //funcion buscar en tabla
    public static int buscarentabla(int busqueda,int[] tabla){
        int numbuscado=0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == busqueda) {
                numbuscado=tabla[i];
            }
            else  {
                numbuscado=0;
            }
        }
        return numbuscado;
    }
    //funcion menor en tabla
    public static int menordelatabla(int[] tabla){
        int nummenor=0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]<nummenor) {
                nummenor=tabla[i];
            }
        }
        return nummenor;
    }
    //funcion mayor en tabla
    public static int mayortabla(int[] tabla){
        int nummayor=0;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i]>nummayor) {
                nummayor=tabla[i];
            }
        }
        return nummayor;
    }
    //funcion tope fernandito
    public static void topetabla(int[] tabla){
        Scanner leer=new Scanner(System.in);
        int num;
        int ultimo=tabla[tabla.length-1];
        do {
            System.out.println("Introduce un numero: ");
            num=leer.nextInt();
        }while (num>ultimo||num<0);

    }
}