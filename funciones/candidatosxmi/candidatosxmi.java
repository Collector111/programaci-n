package funciones.candidatosxmi;
import java.util.Random;
import java.util.Scanner;
public class candidatosxmi {
    public static void main(String[] args) {

    }

    public static int[][] creartabladevotos(int filas, int columnas){
        Random aleatorio = new Random();
        int[][] tabla=new int[filas][columnas];
        for (int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                tabla[i][j]=aleatorio.nextInt(1,500);
            }
        }
        return tabla;
    }
}