
package Problema2;


public interface Capturando {
    String getNom();
    void setNom(String nom);
    String getApell();
    void setApell(String apell);  
     int getEdad();
    void setEdad(int edad);
    
    public double getSalarioBase();
    public void setSalarioBase(double salarioBase);
   public double calcularSalario(int horasTrabajadas);
    

}
