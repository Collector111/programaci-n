package Practicar.Arraylist.act2;

import java.util.ArrayList;
import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<Estudiante> estudiantes=new ArrayList<>();
        String busqueda;
        boolean encontrado=false;

        estudiantes.add(new Estudiante("Aitor", 22));
        estudiantes.add(new Estudiante("Florencio", 40));
        estudiantes.add(new Estudiante("Ortensio", 66));
        estudiantes.add(new Estudiante("Carmen", 70));

        System.out.println("Introduce el estudiante a buscar: ");
        busqueda=leer.nextLine();
        //para los foreach es mejor crear variables temporales
        for(Estudiante temp:estudiantes){
            //en el if lo que haces es buscar dentro del objeto temp buscar el nombre y comparar con equals
            if(temp.nombre.equals(busqueda)){
            encontrado=true;
            }
        }
        
            if (encontrado==true) {
                System.out.println("Estudiante encontrado!!");
            }
            else{
                System.out.println("No esta el estudiante en la lista");
            }
        leer.close();
    }
}

