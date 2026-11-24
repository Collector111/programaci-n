package funciones.trycacht;
import java.util.Scanner;
import java.util.Random;
//Pide: crea una función que reciba un array y una posición,
// y devuelva el número de esa posición. Si la posición no existe, que devuelva -1.
public class posicion {
    public static int numdelarray(int[] nums,int pos){
        try {
            for (int i=0;i<nums.length;i++){
                if (nums[i]==pos){
                    pos=nums[i];
                }
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            return -1;
        }
        return pos;
    }
    public static int[] crearnums(){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Introduce el limite del array");
        int limite=sc.nextInt();
        int[] nums=new int[limite];
        for (int i=0;i<limite;i++){
            nums[i]=rand.nextInt(1,500);
        }
        return nums;
    }
}