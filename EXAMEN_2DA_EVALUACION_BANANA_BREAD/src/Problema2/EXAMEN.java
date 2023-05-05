
package Problema2;

public class EXAMEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manufactura Manufac = new Manufactura("Ruben","González",25,40);
        System.out.println("DATOS DEL EMPLEADO DE MANUFACTURA: " );
        Manufac.imprimirDatos();
        System.out.println("SALARIO EMPLEADO DE MANUFACTURA: " + Manufac.calcularSalario(15));
        
        Apoyo Apo = new Apoyo("Carlos","Reyes",32,50);
        System.out.println("\nDATOS DEL EMPLEADO DE APOYO: " );
        Apo.imprimirDatos();
        System.out.println("SALARIO EMPLEADO DE APOYO: " + Apo.calcularSalario(15));
        
        Jefe  jef = new Jefe("Eduardo","Valadez",40,5000);
        System.out.println("\nDATOS DEL JEFE: " );
        jef.imprimirDatos();
        System.out.println("SALARIO JEFE: " + jef.calcularSalario(0));
                
    }
    
}
