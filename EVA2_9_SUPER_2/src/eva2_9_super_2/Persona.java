/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author danii
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
        this.nombre="------";
        this.apellido="------";
        this.edad=-1;
        
    }

    public Persona(String nombre, String apelliodo, int edad) {
        this.nombre = nombre;
        this.apellido = apelliodo;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apelliodo) {
        this.apellido = apelliodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void imprimirDatos(){
        System.out.println("DATOS");
        System.out.println("Nombre:  "+this.nombre);
        System.out.println("Apellidos:  "+this.apellido);
        System.out.println("Edad: "+this.edad);
    }
    
    
}
