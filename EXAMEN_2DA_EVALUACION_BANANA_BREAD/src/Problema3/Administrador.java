/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema3;

import examen_2da_evaluacion_banana_bread.*;

/**
 *
 * @author danii
 */
public class Administrador  extends EmpleadoTiempoCompleto implements ElegibleParaBono{
    private double porcentajeDelBono;

    public Administrador() {
        porcentajeDelBono=0;
    }
    public Administrador(double porcentajeDelBono, String id, String nombre, double salario) {
        super(id, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
    }
    
     @Override
     public double calcularSalario(){
    
         return salario + calcularBono();
     }
    @Override
    public double calcularBono() {
        return salario * (porcentajeDelBono /100);     
    }
    
    
   

  
    
    
}
