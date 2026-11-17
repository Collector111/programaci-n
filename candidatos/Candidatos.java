package candidatos;
//Autor= Juanjo_DG
import java.util.Random;
import java.util.Scanner;

public class Candidatos {

    public static int[][] leerVotos(int f, int c) {
        Random r = new Random();
        int[][] leerVotos = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                leerVotos[i][j] = r.nextInt(191) + 10;
            }
        }
        return leerVotos;
    }

    public static void printTabla(String[] islas, String[] candidatos, int[][] votos) {
        final int ANCHO = 15;
        int j;
        int i;
        System.out.printf("%-" + ANCHO + "s", "");
        for (j = 0; j < islas.length; j++) {
            System.out.printf("%-" + ANCHO + "s", islas[j]);
        }
        System.out.println();

        for (i = 0; i < candidatos.length; i++) {
            System.out.printf("%-" + ANCHO + "s", candidatos[i]);
            for (j = 0; j < votos[i].length; j++) {
                System.out.printf("%" + (ANCHO - 9) + "d         ", votos[i][j]);
            }
            System.out.println();
        }

    }

    //  public int TotVotos(int[][] votos) {
    //     int total = 0;
    //     for (int[] fila : votos) {
    //         for (int voto : fila) {
    //             total += voto;
    //         }
    //     }
    //     return total;
    // }
    public int TotVotos(int[][] votos) {
        int total = 0;
        for (int i = 0; i < votos.length; i++) {
            for (int j = 0; j < votos[i].length; j++) {
                total += votos[i][j];
            }
        }
        return total;
    }

    public int TotVotosIsla(int[][] votos, int isla) {
        int total = 0;
        for (int[] fila : votos) {
            total += fila[isla];
        }
        return total;
    }

    public int TotVotosCandidato(int[][] votos, int candidato) {
        int total = 0;
        for (int voto : votos[candidato]) {
            total += voto;
        }
        return total;
    }

    public static int FilaMayor(int[][] votos,int columna) {
        int mayor = 0;
        for (int i = 0; i < votos.length; i++) {
            if (votos[i][columna] > votos[mayor][columna]) {
                mayor = i;
            }
        }
        return mayor;
    }
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] islas = {"Tenerife", "El Hierro", "La Gomera", "La Palma", "Gran Canaria", "Lanzarote",
            "Fuerteventura"};
        String[] candidatos = {"Candidato A", "Candidato B", "Candidato C"};
        int[][] votos;// = new int[islas.length][candidatos.length];

        /*
         * = {
         * {233, 54, 45, 14, 435, 87, 67},
         * {445, 45, 87, 23, 276, 81, 89},
         * {185, 34, 34, 78, 305, 66, 38}
         * };
         */
        votos = leerVotos(candidatos.length, islas.length);
        String nombre;
        int columna;
        int c;
        int f;
        int mayor;
        int filaMayor;
        int sumaMayor;
        int candidatoMayor;
        int suma;

        //printTabla(islas, candidatos, votos);

        System.out.println("¿Qué isla quieres consultar?");
        nombre = entrada.nextLine().trim();
        columna = -1;
        for (c = 0; c < islas.length; c++) {
            if (islas[c].equalsIgnoreCase(nombre)) {
                columna = c;
            }
        }
        if (columna == -1) {
            System.out.println("Esa isla no existe");

        }else {
            mayor = votos[0][columna];
            filaMayor = 0;
            for (f = 1; f < votos.length; f++) {
                if (votos[f][columna] > mayor) {
                    mayor = votos[f][columna];
                    filaMayor = f;
                }
            }
            System.out.println(
                    " En " + islas[columna] + " ha ganado " + candidatos[filaMayor] + " con " + mayor + " votos ");
        }
        sumaMayor = 0;
        candidatoMayor = 0;
        for (f = 0; f < votos.length; f++) {
            suma = 0;
            for (c = 0; c < votos[0].length; c++) {
                suma = suma + votos[f][c];
            }
            if (suma > sumaMayor) {
                sumaMayor = suma;
                candidatoMayor = f;
            }
        }
        System.out.println(" El candidato con más votos en total es " + candidatos[candidatoMayor] + " con " + sumaMayor
                + " votos ");

        filaMayor=FilaMayor(votos,columna);
        System.out.println("El candidato mayor es: " + candidatos[filaMayor]);

        entrada.close();
    }

}
