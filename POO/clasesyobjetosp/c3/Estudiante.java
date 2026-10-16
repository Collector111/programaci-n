package POO.clasesyobjetosp.c3;

public class Estudiante {
    // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
    
    String nombre_estudiante;

    public Estudiante(String nombre_estudiante){
        this.nombre_estudiante=nombre_estudiante;
    }

    public void comprobarNota(int nota){
        if(nota>=60){
            System.out.println("Aprobaste "+nombre_estudiante);
        }
        else{
            System.out.println("Suspendiste "+nombre_estudiante);
        }
    }
}
