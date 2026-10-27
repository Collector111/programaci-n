package mediaarrays;

import java.util.Scanner;

public class mediarrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num=0;
        int media;
        int suma=0;
        int tope;
        int tamaño;
        int[] nums;
        System.out.println("Cuantos numeros vas a introducir?");
        tamaño = leer.nextInt();
        nums = new int[tamaño];
        for (int i = 0; i < nums.length; i++) {
                System.out.println("Introduce un numero:");
                num = leer.nextInt();
                nums[i] = num;
        }
        tope=num;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=tope){
             suma=suma+nums[i];   
            }
        }
        media=suma/nums.length;

        System.out.println("La media es: "+media);
        leer.close();
    }
}
