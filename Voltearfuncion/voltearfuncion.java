package Voltearfuncion;
import java.util.Scanner;
class voltearfuncion{
    public static int numerinesvolteados(int n1){
        int invertido=0;
        int digito;

        while (n1 !=0){
            digito= n1%10;
            invertido=invertido*10+digito;
            n1=n1/10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = input.nextInt();

        System.out.println("El numero volteado es: "+numerinesvolteados(n1));
    }
}