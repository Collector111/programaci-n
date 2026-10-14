package POO.clasesyobjetosp.c1;

public class Book {
    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.

    String title;
    String author;

    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }

    public void MostrarDatos(){
        System.out.println("El titulo del libro es "+title+" y su autor es "+author);
    }
}
