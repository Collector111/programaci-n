package funcionesclase.media;

import java.util.Random;

public class media {
    public static double mediaEdades(int[] edades) {
        double media;
        double suma = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 0 || edades[i] > 135) {
                throw new RuntimeException("Edad negativa o mayor del limite");
            }
            suma = suma + edades[i];
        }
        media = suma / edades.length;
        return media;
    }
    /*
     * public static int find(String frase, char ch) {
     * int pos = -1;
     * int i = 0;
     * while (i < frase.length()-1 && pos == -1) {
     * if (frase.charAt(i) == ch) {
     * pos = i;
     * }
     * i++;
     * }
     * return pos;
     * }
     */

    public static int find(String frase, char ch) {
        int i = 0;
        while (i < frase.length() - 1 && frase.charAt(i) != ch) {
            i++;
        }
            if (frase.length() == 0 || frase.charAt(i) != ch) {
                i = -1;
            }

        
        return i;
    }

    public static void main(String[] args) {
        /*
         * Random ran=new Random();
         * int[] edades=new int[3];
         * for(int i=0;i<edades.length;i++){
         * edades[i]=ran.nextInt(1,200);
         * }
         * 
         * System.out.println(mediaEdades(edades));
         */


        System.out.println(find("Hola",'o'));
        try {
            System.out.println(find(null, 'o'));
            System.out.println("ERROR");
        } catch (Exception e) {
            System.out.println("ok");
        }

    }
}
