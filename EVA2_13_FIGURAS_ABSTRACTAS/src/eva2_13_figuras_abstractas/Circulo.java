/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_figuras_abstractas;

/**
 *
 * @author danii
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        radio=0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double calcularArea(){
       return Math.PI*(radio*radio);
    }
    @Override
    public double calcularPeri(){
     return Math.PI*(radio*2);  
    }
    @Override
    public String toString(){
    String cade="DatoS Triángulo : \n"+
                   "ÁREA: "+calcularArea()+ "\n"+
                   "PERÍMETRO:  "+calcularPeri();
      return cade;
                      
    }
}
