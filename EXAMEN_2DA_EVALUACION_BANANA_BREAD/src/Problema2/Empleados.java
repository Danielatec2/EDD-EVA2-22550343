
package Problema2;

/**
 *
 * @author pesca
 */
public abstract class Empleados implements Capturando {
    private String nom;
    private String apell;
    private int edad;
    private double salarioBase;

    public Empleados() {
      this.nom = "---";
      this.apell = "---";
      this.edad = 0;
      this.salarioBase = 0;   
    }
    
    
public Empleados(String nom, String apell, int edad, double salarioBase) {
        this.nom = nom;
        this.apell = apell;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    

    @Override
    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setNom(String nom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getApell() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setApell(String apell) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setEdad(int edad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public void imprimirDatos(){
    
}

    
    
}
