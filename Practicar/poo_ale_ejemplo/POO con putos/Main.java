
public class Main {

    public static void main(String[] args) {
        Persona SoldadoInvierno = new Persona("Bucky", "Pereiras", "Pereiras", 40, false, true);
        SoldadoInvierno.comer();

        System.out.println(SoldadoInvierno.cagar()); // 1
        System.out.println(SoldadoInvierno.cagar()); // 2

        // ---------------------------------------------------
        SoldadoInvierno.esMichaelJackson();
        SoldadoInvierno.esMichaelJackson();

        Puto Astolfo = new Puto("Astolfo", "Orlando", "Furioso", 19, true, false, false, false, 0, 0, false,false);

        System.out.println(Astolfo.toString());

        Astolfo.sesentaNueve();
        Astolfo.aceptaCliente();

        System.out.println(Astolfo.toString());

        Astolfo.sesentaNueve();

        System.out.println(Astolfo.toString());

        Astolfo.sesentaNueve();

        System.out.println(Astolfo.toString());

        Astolfo.porDetras();

        System.out.println(Astolfo.toString());

        Astolfo.Xupada();

        System.out.println(Astolfo.toString());

        System.out.println(Astolfo.ingresalocal());

        System.out.println(Astolfo.ingresalocal());

    }
}
