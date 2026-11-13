package candidatos;

import java.util.Random;
import java.util.Scanner;

public class Candidatos_v01 {

    public static int[][] leerVotos(int f, int c) {
        int[][] votos;
        Random r = new Random();
        votos = new int[f][c];
        for (int ff = 0; ff < votos.length; ff++)
            for (int cc = 0; cc < votos[0].length; cc++)
                votos[ff][cc] = r.nextInt(500);
        return votos;
    }

    public static void printTabla(String[] islas, String[] candidatos, int[][] votos) {
        final int ancho = 15;
        int j;
        int i;
        System.out.printf("%-" + ancho + "s", "");
        for (j = 0; j < islas.length; j++) {
            System.out.printf("%-" + ancho + "s", islas[j]);
        }
        System.out.println();

        for (i = 0; i < candidatos.length; i++) {
            System.out.printf("%-" + ancho + "s", candidatos[i]);
            for (j = 0; j < islas.length; j++) {
                System.out.printf("%" + (ancho-9) + "d         ", votos[i][j]);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] islas = { "Tenerife", "El Hierro", "La Gomera", "La Palma", "Gran Canaria", "Lanzarote",
                "Fuerteventura" };
        String[] candidatos = { "Candidato A", "Candidato B", "Candidato C" };
        int[][] votos;
        votos = leerVotos(candidatos.length, islas.length);
        /*
         * int[][] votos = {
         * {233, 54, 45, 14, 435, 87, 67},
         * {445, 45, 87, 23, 276, 81, 89},
         * {185, 34, 34, 78, 305, 66, 38}
         * };
         */
        String nombre;
        int c, f;
        int mayor;
        int filaMax, sumaMayor;
        int candidatoMayor;
        int suma;

        printTabla(islas, candidatos, votos);

        System.out.println("¿Qué isla quieres consultar?");
        nombre = entrada.nextLine().trim();

        c = 0;
        while (c < islas.length - 1 & !islas[c].equalsIgnoreCase(nombre))
            c++;
        if (islas[c].equalsIgnoreCase(nombre)) {
            // ENCONTRADO
            // BUSQUEDA MÁXIMO
            filaMax = 0;
            for (f = 1; f < votos.length; f++) {
                if (votos[f][c] > votos[filaMax][c]) {
                    filaMax = f;
                    System.out.println(" En " + islas[c] + " ha ganado " + candidatos[filaMax] + " con "
                            + votos[filaMax][c] + " votos ");
                }

            }

        } else {
            // NO ENCONTRADO
            System.out.println("Esa isla no existe");
        }

        /*
         * sumaMayor = 0;
         * candidatoMayor = 0;
         * for (f = 0; f < votos.length; f++) {
         * suma = 0;
         * for (c = 0; c < votos[0].length; c++) {
         * suma = suma + votos[f][c];
         * }
         * if (suma > sumaMayor) {
         * sumaMayor = suma;
         * candidatoMayor = f;
         * }
         * }
         * System.out.println(" El candidato con más votos en total es " +
         * candidatos[candidatoMayor] + " con " + sumaMayor + " votos " );
         */
        entrada.close();
    }

}
