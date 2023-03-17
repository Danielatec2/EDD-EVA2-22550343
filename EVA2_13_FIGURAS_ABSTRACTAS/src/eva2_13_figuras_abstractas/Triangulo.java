/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_figuras_abstractas;

/**
 *
 * @author danii
 */
public class Triangulo extends Figura  {
    public double altura, base;

    public Triangulo() {
        
       base=0;
       altura=0;
       
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    @Override
    public double calcularArea(){
     return (base*altura)/2;   
    }
    @Override
    public double calcularPeri(){//TRIÁNGULO RECTANGULO
        double x=0;
        
       x=Math.sqrt((base*base)+ (altura*altura));
      
       
        return x+(base+altura);
               
    }
    @Override
    public String toString(){
    String cade="DatoS Triángulo : \n"+
                   "ÁREA: "+calcularArea()+ "\n"+
                   "PERÍMETRO:  "+calcularPeri();
      return cade;
                      
    }

}
