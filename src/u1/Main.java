/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1;

/**
 *
 * @author fiore
 */
public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        
        Libro l1 = new Libro("El principito", "Antoine de Saint-Exupery" , Genero.INFANTIL);
        Libro l2 = new Libro("Breves respuestas a las grandes preguntas" , "Stephen Hawking", Genero.CIENCIA );
        Libro l3 = new Libro("Dune", "Frank Herbert", Genero.FICCION);
        Libro l4 = new Libro("Mas vale lola que mal acompañada", "Lola Vendetta", Genero.COMEDIA);
        
        
        biblioteca.agregarLibro(l1);
        biblioteca.agregarLibro(l2);
        biblioteca.agregarLibro(l3);
        biblioteca.agregarLibro(l4);
        
        
        biblioteca.listarLibros();
        
        System.out.println("Libros creados: " + Libro.getContadorLibros());
    }
}
