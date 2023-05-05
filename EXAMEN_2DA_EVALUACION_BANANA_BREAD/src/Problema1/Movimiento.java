/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author Perti
 */
//clase abstracta 
public abstract class Movimiento implements captura{
   private double V0; 
   private double Vf; 
   private double A; 
   private double T; 

   //Constructor sin parametros, con valores indicados por nosotros 
   public Movimiento (){
       this.V0 = 0;
        this.Vf = 0;
        this.A = 0;
        this.T = 0;
   }
   
   //Constructor con parametros que recibe el usuario 
    public Movimiento(double V0, double Vf, double A, double T) {
        this.V0 = V0;
        this.Vf = Vf;
        this.A = A;
        this.T = T;
    }

    //Metodos Get y Set  para la captura 
    public void setV0(double V0) {
        this.V0 = V0;
    }

    public void setVf(double Vf) {
        this.Vf = Vf;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setT(double T) {
        this.T = T;
    }

    public double getV0() {
        return V0;
    }

    public double getVf() {
        return Vf;
    }

    public double getA() {
        return A;
    }

    public double getT() {
        return T;
    }

    //metodo abstracto para las formulas 
   public abstract double CalcularDistancia(); 
  
}

