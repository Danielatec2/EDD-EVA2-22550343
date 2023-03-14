/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author danii
 */
public class Persona {
    private String nombre;
    private String apelliodo;
    private int edad;

    public Persona() {
        
    }

    public Persona(String nombre, String apelliodo, int edad) {
        this.nombre = nombre;
        this.apelliodo = apelliodo;
        this.edad = edad;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelliodo() {
        return apelliodo;
    }

    public void setApelliodo(String apelliodo) {
        this.apelliodo = apelliodo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
