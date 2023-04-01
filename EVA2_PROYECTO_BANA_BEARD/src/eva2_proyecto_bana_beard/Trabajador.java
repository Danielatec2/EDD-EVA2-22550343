/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_proyecto_bana_beard;

/**
 *
 * @author danii
 */
public class Trabajador implements Resultados {
    private double numControl;
    private String nombre;
    private String apellido;

    public Trabajador() {
        this.numControl=0;
        this.nombre="";
        this.apellido="";
    }

    public Trabajador(double numControl, String nombre, String apellido) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public double getNumControl() {
        return numControl;
    }

    public void setNumControl(double numControl) {
        this.numControl = numControl;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void imprimirResultados() {
        System.out.println("DATOS DEL TRABAJADOR ");
        System.out.println("Número de Control: "+getNumControl());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
             
    }
    
    
}
