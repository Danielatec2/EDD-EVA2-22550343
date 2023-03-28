/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author danii
 */
public interface Figuras {
    //NO SE PUEDEN INSTANCIAR LAS INTERFACES , SON COMO UN CONTRATO: ESTOY OBLIGADO A IMPLEMENTAR
    // SOLO LOS MÉTODOS ABSTRACTOS Y CONSTANTES
    public abstract double  calcularArea();
    double calcularPeri(); 
    
}
