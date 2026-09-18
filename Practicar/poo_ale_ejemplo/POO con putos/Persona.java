
public class Persona {

    //* Atributos
    String nombre;
    String apellido1;
    String apellido2;
    int edad;
    boolean raza; //~ Negro = false o Blanco = true;
    boolean tieneSexo;
    int cuentaMierda;

    //! Constructor
    public Persona(String nombre, String apellido1, String apellido2, int edad, boolean raza, boolean tieneSexo) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido1 = apellido2;
        this.edad = edad;
        this.raza = raza;
        this.tieneSexo = tieneSexo;
        cuentaMierda = 0;
    }

    //!Metodos
    public void comer() {
        System.out.println(nombre + " ha comido");
    }

    public int cagar() {
        System.out.println(nombre + ", acaba de cagar");
        cuentaMierda++;
        return cuentaMierda;
    }

    public boolean cambiarColor() {
        raza = !raza;
        return raza;
    }

    public void esMichaelJackson() {
        //* es blanco
        if (raza == true) {
            System.out.println("Es michael Jackson");
        } else {
            System.out.println("Es michael Jackson en los Jackson five");
        }
    }

}
