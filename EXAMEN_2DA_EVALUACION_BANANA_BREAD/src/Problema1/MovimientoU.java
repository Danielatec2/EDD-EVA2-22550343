/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;


/**
 *
 * @author Perti
 */
    //clase que extiende de Movimiento para calcular la distancia 
public  class MovimientoU extends Movimiento {
    
public MovimientoU(){
  super (); 
}      
public MovimientoU(double V0, double Vf,double A,double T){
    super (V0,Vf,A,T); 
}

//Formula para calcular la distancia de un movimiento Uniforme 

@Override
public double CalcularDistancia(){
    double distancia = (getV0()+getVf())*getT() /2; 
    return distancia; 
}

}
