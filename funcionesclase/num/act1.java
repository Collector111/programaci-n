//tiene que dar un numero entre 0 y el tope
// (el tope pedido por teclado)(tiene que pedirlo hasta que funcione y cumpla la norma)
package funcionesclase.num;
import java.util.Scanner;
public class act1 {

    public static int leerentero(int tope) {
        Scanner leer=new Scanner(System.in);
        int num;
        do{
            num=leer.nextInt();
        }while (num>=tope || num<0);
        return num;
    }
    public static int leerenterov2(int desde,int tope){
        Scanner leer=new Scanner(System.in);
        int num;
        do{
            num=leer.nextInt();
        }while (num>=tope || num<desde);
        return num;
    }
}