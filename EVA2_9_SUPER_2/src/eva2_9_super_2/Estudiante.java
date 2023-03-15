/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

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

    public Estudiante() {// HAY QUE INCLUIR EL CONTRUCTOR DE DEFAULT
        super(); // LLAMADA AL CONSTRUCTOR DE LA SUPER CLASE
        this.noControl="________";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        
        super(nombre,apellido, edad);
  
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override 
    //@Override OCULTA EL METODO (CON LA MISMA FIRMA ) EN LA SUPER CLASE , EN ESTE CASO, RESMPLAZA A imprimirDatos()de Persona
    public void imprimirDatos(){
           super.imprimirDatos();//PERSONA 
           System.out.println("No. Control:"+ noControl);
           //NO NECESITO LOS GET PARA IMPRIMIR 
        /*System.out.println("NOMBRE: "+getNombre());
        System.out.println("APELLIDO: "+getApellido());
        System.out.println("EDAD: "+getEdad());
        System.out.println("SOY ESTUDIANTEEE!!!");*/
     
    }
}
