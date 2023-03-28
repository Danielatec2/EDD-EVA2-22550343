/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author danii
 */
// DOCENTES is -a Persona
public class Docentes extends Persona {
    private String plaza;

    public Docentes() {
        super();
        this.plaza="________";
    }
    public Docentes(String nombre, String apellido, int edad, String plaza){
        super(nombre,apellido,edad);
        this.plaza=plaza;
    }
    

    public Docentes(String plaza) {
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
    public void imprimirDatos(){
      super.imprimirDatos();
        System.out.println("PLAZA: "+plaza);
    }
    
    
    
}
