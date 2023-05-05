/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema1;

/**
 *
 * @author Perti
 */
/*De la misma manera que la formula para calcular el movmientos uniforme
esta clase extiende de movimiento para calcular un movimiento Unifore acelerado*/
public class MovimientoUa extends Movimiento {

    
    public MovimientoUa() {
        super();
    }

    public MovimientoUa(double V0, double Vf, double A, double T) {
        super(V0, Vf, A, T);
    }

//Metodo abstracto CalcularDistancia para la formula  
    @Override
    public double CalcularDistancia() {
        double distancia = ((getV0() + getVf())/2 *getT() );
        return distancia;
    }
}
