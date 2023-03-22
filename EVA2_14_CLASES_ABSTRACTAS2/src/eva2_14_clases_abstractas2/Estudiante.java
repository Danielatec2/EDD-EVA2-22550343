/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_clases_abstractas2;

import java.awt.BorderLayout;

/**
 *
 * @author danii
 */
public class Estudiante extends Persona {
    private String numControl; 

    public Estudiante() {
        numControl="";
        
    }

    public Estudiante(String numControl) {
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    

    

    @Override
    public void imprimirDatos() {
        System.out.println("DATOS DEL ESTUDIANTE");
        System.out.println("NÚMERO DE CONTROL:  "+numControl );
   
    }
    
}
