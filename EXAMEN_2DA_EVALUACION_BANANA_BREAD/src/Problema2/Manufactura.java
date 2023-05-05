
package Problema2;

/**
 *
 * @author pesca
 */
public class Manufactura extends Empleados {
    
    public Manufactura(String nom, String apell, int edad, double salarioBase) {
        super(nom, apell, edad, salarioBase);
    }
    public Manufactura(){
        super("","",0, 40);
    }

    
    @Override
    public double calcularSalario(int horasTrabajadas) {
        return getSalarioBase() * horasTrabajadas;
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
    }

    }

  
    
