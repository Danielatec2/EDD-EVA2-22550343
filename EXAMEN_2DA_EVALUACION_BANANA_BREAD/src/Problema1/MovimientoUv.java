/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author Perti
 */
//Ultima clase para calcular un movimiento uniforme igual que extiende de Movimiento 
public  class MovimientoUv extends Movimiento{
    
    public MovimientoUv (){
    super (); 
}
    public MovimientoUv (double V0,double Vf,double A, double T){
        super(V0,Vf,A,T); 
    }
    
    //Metodo abstracto CalcularDistancia para la formula  
    public double CalcularDistancia (){
        double Distancia =(getVf()-getV0())/(2*getA());
        return Distancia; 
    }
}
