package Practicar.act2;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero: ");
        num=leer.nextInt();

        if(num%2==0){
            System.out.println("Este numero es par");
        }else{
            System.out.println("Este numero es impar");
        }
        leer.close();
    }
}
