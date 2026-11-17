package votaciones;
import java.util.Scanner;
public class votacion {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String[] islas={"La palma","Tenerife","Gran Canaria","Lanzarote","Fuerteventura","La Gomera","El Hierro"};
        String[] Candidatos={"Candidato A","Candidato B","Candidato C"};
        int[][] votos={
            {233,54,45,14,435,87,67},
            {445,45,87,23,276,81,89},
            {185,34,34,78,305,66,38},
        };
        String nombreisla;
        int indiceisla;
        int j=0;
        int i;

        System.out.println("Introduce la isla que deseas consultar:");
        nombreisla=leer.nextLine();
        for(i=0;i<islas.length;i++){
            if(islas[i].equalsIgnoreCase(nombreisla)){
                indiceisla=i;
            }
        }

        while (j<islas.length-1 & !islas[i].equalsIgnoreCase(nombreisla)) {
            if (islas[i].equalsIgnoreCase(nombreisla)) {
                
            }
            j++;

        }

    }
}
