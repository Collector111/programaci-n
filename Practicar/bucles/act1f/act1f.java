package Practicar.bucles.act1f;

public class act1f {
    // Muestra las tablas del 1 al 10
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int multi;
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                multi = num1 * num2;
                System.out.println(num1 + " x " + num2 + "= " + multi);
                num2++;
            }
            num1++;
            num2 = 0;
        }
    }
}
