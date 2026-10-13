package funciones.f6;
import java.util.ArrayList;
import java.util.Scanner;
public class f6 {
    public static void main(String[] args) {
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        Scanner leer= new Scanner(System.in);
        ArrayList<String> listota=new ArrayList<>(8);

        for(int i=0;i<8;i++){
            System.out.println("Introduce una palabra");
            listota.add(leer.nextLine());
        }
        milista(listota);
        leer.close();
    }

    public static void milista(ArrayList<String> listota){
        for(int i=0;i<listota.size();i++){
            System.out.println(listota.get(i));
        }
    }
}
