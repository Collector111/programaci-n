package POO.clasesyobjetosp.c2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        var CuentaBancaria=new CuentaBancaria("Aitor Marrero Torres", 50.0);
        Scanner leer=new Scanner(System.in);

        int teclado=0;
        Double cantidad;

        do {
            System.out.print("""
                    Introduce una opcion:
                    1. Depositar
                    2. Retirar
                    3. Mostrar Saldo
                    4. Salir
                    """);
            
            teclado=leer.nextInt();

            switch (teclado) {
                case 1:
                    System.out.println("Cuanto desea depositar?");
                    cantidad=leer.nextDouble();
                    CuentaBancaria.Depositar(cantidad);
                    break;
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    cantidad=leer.nextDouble();
                    CuentaBancaria.Retirar(cantidad);
                    break;
                case 3:
                    CuentaBancaria.Mostrar();
                    break;
            
                default:
                    teclado=4;
                    
            }
        } while (teclado!=4);
        leer.close();
    }
}
