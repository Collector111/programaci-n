
public class Puto extends Persona {

    boolean virginidad;
    boolean ETS; //! (enfermedad de transmision sexual) != (Entornos de desarrollo)
    int popularidad;
    int ganancias;
    boolean tieneCliente;
    boolean tienelocal;

    public Puto(String nombre, String apellido1, String apellido2, int edad, boolean raza, boolean tieneSexo, boolean virginidad, boolean ETS, int popularidad, int ganancias, boolean tieneCliente,boolean tienelocal) {

        super(nombre, apellido1, apellido2, edad, raza, tieneSexo);

        virginidad = false;
        ETS = false;
        popularidad = 0;
        ganancias = 0;
        tieneCliente = false;
        tienelocal= false;
    }

    public void aceptaCliente() {
        if (!tieneCliente) {
            tieneCliente = true;
        } else {
            System.out.println("Ya se lo estan cogiendo");
        }
    }

    public boolean ingresalocal(){
        if(tienelocal==false){
            tienelocal= !tienelocal;
        }else{
            System.out.println("Ya tiene local no puede estar en 2 al mismo tiempo");
        }
        return tienelocal;
    }

    public void sesentaNueve() {
        if (tieneCliente == false) {
            System.out.println("Primero necesita un cliente");
        } else {
            System.out.println("El cliente y Astolfo hacen un 69");
            if (ETS == false && virginidad == false) {
                ETS = true;
                virginidad = true;
            }
            ganancias = ganancias + 69;
            popularidad = popularidad + 69;
        }

    }

    public void Xupada() {
        if (tieneCliente == false) {
            System.out.println("Primero necesita un cliente");
        } else {
            System.out.println("Astolfo se la Xupa al cliente");
            if (ETS == false && virginidad == false) {
                ETS = true;
                virginidad = true;
            }
            ganancias = ganancias + 1;
            popularidad = popularidad + 50;
        }

    }

    public void porDetras() {

        if (tieneCliente == false) {
            System.out.println("Primero necesita un cliente");
        } else {
            System.out.println("El cliente le da por detrás a Astolfo");
            if (ETS == false && virginidad == false) {
                ETS = true;
                virginidad = true;
            }
            ganancias = ganancias + 111;
            popularidad = popularidad + 1;
        }

    }

    @Override
    public String toString() {
        String separador = "\n -------------------------------------------------- \n";
        return "nombre: " + nombre + ", Edad: " + edad + " , ¿tiene Virginidad? -> " + virginidad + " , ¿tiene ETS? -> " + ETS + "\n Ganancias: " + ganancias + " $ " + "\n Popularidad: " + popularidad + "\n ¿Tiene Cliente? -> " + tieneCliente + separador;

    }

}
