package Practicar.act3;

import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);

        int num=0;

        while(num!=7){
            System.out.println("Introduce un numero:");
            num=leer.nextInt();
        }
        leer.close();
    }
    
}
