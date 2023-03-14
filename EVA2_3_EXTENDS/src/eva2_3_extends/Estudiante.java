/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

/**
 *
 * @author danii
 */
//CLASE DERIVADA Y EXTENDS A LA CLASE BASE 
// SUBCLASE ESTENDS SUPER CLASE PADRE
//HIJO DE ESTENDS PADRE

//ESTJUDIANTE is -a Persona
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante() {
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
}
