package Practicar.bucles.actmoneda;
import java.util.Scanner;
import java.util.Random;

/*Moneda
Genera aleatoriamente:
0 → Cara
1 → Cruz */
public class actmoneda {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Random random= new Random();

        int num=0;
        String salir;
        int moneda;

        while(num!=1){
            moneda=random.nextInt(0,2);
            System.out.println("Quieres salir? si/no");
            salir=leer.nextLine().toLowerCase();
            if(salir.equals("si")){
                num=1;
            }
            else{
                if(moneda==1){
                    System.out.println("La moneda ha salido cara");
                }
                else{
                    System.out.println("La moneda ha salido cruz");
                }
            }
        }
        leer.close();
    }
}
