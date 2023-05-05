
package Problema2;

/**
 *
 * @author pesca
 */
public class Apoyo extends Empleados {
   
    public Apoyo(String nom, String apell, int edad, double salarioBase) {
        super(nom, apell, edad, salarioBase);
    }
   
    public Apoyo(){
        super("","",0,50);        
               
    }

    @Override
    public double calcularSalario(int horasTrabajadas) {
        double salario = getSalarioBase() * horasTrabajadas;
        return salario + salario * 0.5;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos(); 
    }   
    
}
