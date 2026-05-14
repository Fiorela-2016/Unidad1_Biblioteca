/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u1;

/**
 *
 * @author fiore
 */
public class Libro {
    private String titulo;
    private String autor;
    private Genero genero;
    private static int contadorLibros = 0;
    private final int id;
    
    
    //No puede modificarse el atributo id porque fue declarado con la palabra final la cual solo se asigna una vez y asi cada libro tenga un identificador fijo y que sea unico
    // Una vez una variable final es asignada no se puede modificar, si se intenta java da un error de compilacion
    
    
    
    public Libro(String titulo, String autor, Genero genero) {
        this.id = contadorLibros + 1;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        contadorLibros++;
    }
    
    public int getId(){
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void  setTitulo(String titulo) {
        this.titulo = titulo;
   }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Genero getGenero(){
        return genero;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public static int getContadorLibros(){
        return contadorLibros;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Genero: " + this.genero);
        System.out.println("ID: " + this.id);
    }
}
