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
public abstract class Empleados {
    private String id;
    private String nombre;
    protected double salario;

    public Empleados() {
        id="";
        nombre="";
        salario=0;
    }

    public Empleados(String id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract double calcularSalario( );
    
    
    
        
       
    
    
    
    
    
}
