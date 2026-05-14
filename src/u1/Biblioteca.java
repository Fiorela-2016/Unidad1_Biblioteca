/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1;

/**
 *
 * @author fiore
 */
import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();
    
    public void agregarLibro(Libro  libro){
        libros.add(libro);
    }
    
    public void listarLibros(){
        for (Libro l: libros) {
        l.mostrarInfo();
    System.out.println("-------------");
        }
    }
}
