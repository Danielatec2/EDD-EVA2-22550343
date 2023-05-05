
package Problema2;

/**
 *
 * @author pesca
 */
public class Jefe extends Empleados {
    
    public Jefe(String nom, String apell, int edad, double salarioBase) {
        super(nom, apell, edad, salarioBase);
    }   
    
    public Jefe(){
        super("","",0,5000);
    }

    @Override
    public double calcularSalario(int horasTrabajadas) {
        return getSalarioBase();

    }

    @Override
    public void imprimirDatos() {
    }   
    
}
